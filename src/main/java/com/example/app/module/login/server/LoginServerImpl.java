package com.example.app.module.login.server;

import com.example.app.currency.ResultData;
import com.example.app.module.login.entity.*;
import com.example.app.module.login.mapper.LoginEmailMapper;
import com.example.app.module.login.mapper.LoginUserMapper;
import com.example.app.utils.email.sendEmailServer;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;

@Service
public class LoginServerImpl implements LoginServer {

    @Resource
    private sendEmailServer mailService;//注入发送邮件的各种实现方法

    @Resource
    private TemplateEngine templateEngine;//注入模板引擎

//    [[${user}]] 绑定变量
    @Resource
    private LoginUserMapper loginUserMapper;

    @Resource
    private LoginEmailMapper loginEmailMapper;

    @Override
    public ResultData register(LoginUser entity) {

            LoginEmail email=loginEmailMapper.selectByPrimaryKey(entity.getEmail());
             System.out.println(email);
            if(email==null){
                return new ResultData("注册失败,请先进行邮箱验证", "false");
            }

            if(loginUserMapper.selectByPrimaryName(entity.getUserName())!=null){
                return new ResultData("注册失败,账户已存在", "false");
            }
            if(email.getReCode()==2){
                return new ResultData("邮箱已绑定其他账户", "false");
            }
            loginUserMapper.insert(entity);

            LoginEmailExample example=new LoginEmailExample();
            LoginEmailExample.Criteria criteria1 = example.createCriteria();
            criteria1.andEmailEqualTo(entity.getEmail());

            LoginEmail em = new LoginEmail();
            em.setEmail(entity.getEmail());
            em.setReCode(2);
            loginEmailMapper.updateByPrimaryKeySelective(em);
            return new ResultData("注册成功", "true");

    }

    @Override
    public ResultData sendCode(String e) {
        LoginEmail emTity = loginEmailMapper.selectByPrimaryKey(e);
        Integer random = (int) (Math.random() * 1000000);
        LoginEmail em = new LoginEmail();
        em.setEmail(e);
        em.setVfcCode("" + random);
        em.setCreatTime(new Date());
        if (emTity == null) {
            try {
                Context context = new Context();
                context.setVariable("code", random);
                String emailContent = templateEngine.process("emailTemp", context);
                em.setReCode(0);
                mailService.sendHtmlMail(e, "鸡办平台", emailContent);
            } catch (Exception ex) {
                ex.printStackTrace();
                return new ResultData("发送失败,请输入正确的邮箱", "false");
            }
            loginEmailMapper.insert(em);
            return new ResultData("发送成功(验证码5分钟内有效)", "true");
        } else {
            if (new Date().getTime() - emTity.getCreatTime().getTime() <60000) {
                return new ResultData("邮箱已发送请60秒之后再试", "false");
            }
            try{
                Context context = new Context();
                context.setVariable("code", random);
                String emailContent = templateEngine.process("emailTemp", context);

                mailService.sendHtmlMail(e, "鸡办平台", emailContent);
            } catch (Exception ex) {
                ex.printStackTrace();
                return new ResultData("发送失败,邮箱发送服务异常", "false");
            }

            loginEmailMapper.updateByPrimaryKeySelective(em);
            return  new ResultData("发送成功(验证码5分钟内有效)", "true");

        }
    }

    @Override
    public ResultData VerificationCode(String code, String email, HttpServletRequest request) {
        LoginEmail em=loginEmailMapper.selectByPrimaryKey(email);
        if(em==null){
            return new ResultData("请先进行邮箱验证", "false");
        }else {
            if(new Date().getTime()-em.getCreatTime().getTime()>300000){
                return new ResultData("验证码超时,请从新发送", "timeOut");
            }
            if(!em.getVfcCode().equals(code)){
                return new ResultData("验证失败", "false");
            }

//            LoginEmail emVo = new LoginEmail();
//            emVo.setReCode(1);
//            emVo.setEmail(email);
//            loginEmailMapper.updateByPrimaryKeySelective(emVo);
            request.getSession().setAttribute("email",email);
            request.getSession().setAttribute("time", new Date().getTime());
            return new ResultData("验证成功", "true");
        }

    }

    @Override
    public ResultData login(HttpServletRequest request) {
//        try {
            Object email=request.getSession().getAttribute("email");
            if(email!=null){

                LoginUserExample example=new LoginUserExample();
                LoginUserExample.Criteria criteria1 = example.createCriteria();
                criteria1.andEmailEqualTo(email+"");

                LoginUser emVo=loginUserMapper.selectByExampleOne(example);

                if(emVo!=null){
                    request.getSession().setAttribute("userName",emVo.getUserName());
                    request.getSession().setAttribute("password",emVo.getPassword());
                    request.getSession().setAttribute("time", new Date().getTime());
                    return new ResultData("登录成功,即将为您跳转","true");
                }
                return new ResultData("登录失败,邮箱未注册","false");
            }else {
                return new ResultData("请先进行邮箱认证","false");
            }

//        }catch (Exception e){
//            return new ResultData("登录失败,异常错误","false");
//        }
    }

    @Override
    public ResultData userLogin(@Valid loginVo entity, HttpServletRequest request) {
        LoginUserExample example=new LoginUserExample();
        LoginUserExample.Criteria criteria1 = example.createCriteria();
        criteria1.andUserNameEqualTo(entity.getUserName());
        criteria1.andPasswordEqualTo(entity.getPassword());

        if(loginUserMapper.selectByExampleOne(example)!=null){
            request.getSession().setAttribute("userName",entity.getUserName());
            request.getSession().setAttribute("password",entity.getPassword());
            request.getSession().setAttribute("time", new Date().getTime());

            return new ResultData("登录成功","true");
        }
        return new ResultData("登录失败,账户或密码错误","false");
    }


}
