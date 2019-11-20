package com.example.app.module.login.controller;


import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;
import com.example.app.currency.ResultData;
import com.example.app.module.login.entity.LoginUser;
import com.example.app.module.login.entity.loginVo;
import com.example.app.module.login.server.LoginServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.crypto.Data;
import java.util.Date;

@Api(tags = "login模块操作接口", consumes = "application/json", produces = "application/json", protocols = "http, https, ws, wss")
@RequestMapping("/login")
@RestController
public class LoginController {

    @Resource
    private LoginServer loginServer;

    @ApiOperation(value = "接口说明",httpMethod = "POST",notes = "用户注册接口")
    @RequestMapping(value = "/register",method= RequestMethod.POST)
    public ResultData register(@Valid LoginUser entity,HttpServletRequest request){

        if(entity.getEmail().equals(request.getSession().getAttribute("email"))) {
            return loginServer.register(entity);
        }else {
            return new ResultData("邮箱验证失败,请重新注册", "false");
        }
    }


    @Decrypt
    @ApiOperation(value = "接口说明",httpMethod = "GET",notes = "发送邮件验证码接口")
    @RequestMapping(value = "/emailSend",method= RequestMethod.GET)
    public ResultData emailTest(String e){
        System.out.println(e);
        return loginServer.sendCode(e);

    }

    @ApiOperation(value = "接口说明",httpMethod = "GET",notes = "免密码登录接口")
    @RequestMapping(value = "/emailLogin",method= RequestMethod.GET)
    public ResultData emailLogin(HttpServletRequest request){

        return loginServer.login(request);

    }

    @ApiOperation(value = "接口说明",httpMethod = "POST",notes = "账户登录接口")
    @RequestMapping(value = "/rentLogin",method= RequestMethod.POST)
    public ResultData userLogin(@Valid loginVo entity, HttpServletRequest request){

        return loginServer.userLogin(entity,request);

    }

    @ApiOperation(value = "接口说明",httpMethod = "GET",notes = "对验证码进行认证")
    @RequestMapping(value = "/VerificationCode",method= RequestMethod.GET)
    public ResultData VerificationCode(String code, String email, HttpServletRequest request){


        return loginServer.VerificationCode(code,email,request);

    }

    @ApiOperation(value = "接口说明",httpMethod = "GET",notes = "退出登录,清除session")
    @RequestMapping(value = "/logOut",method= RequestMethod.GET)
    public void VerificationCode(HttpSession session, HttpServletResponse response) throws Exception{

        //销毁session,退出登录
        session.invalidate();
        //重定向至主页面
        response.sendRedirect("/demo");

    }




}
