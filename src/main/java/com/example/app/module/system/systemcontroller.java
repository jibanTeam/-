package com.example.app.module.system;


import com.example.app.currency.userInfo;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.context.Context;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class systemcontroller {

    //    @Resource
//    private sendEmailServer mailService;
//
//    @Resource
//    private TemplateEngine templateEngine; ModelMap map
    @RequestMapping("/demo")
    public String sample() {

        return "landing";

    }

    @RequestMapping("/login")
    public String login() {

        return "login";

    }

    @RequestMapping("/register")
    public String register(HttpSession session) {

        //进此页面时,清除session
        session.invalidate();
        return "register";

    }


    @RequestMapping("/")
    public String index(HttpServletResponse response) throws Exception {

       response.sendRedirect("/demo");
        return "register";

    }

//try {
//        Context context = new Context();
//        context.setVariable("project", "IJPay");
//        context.setVariable("author", "Javen");
//        context.setVariable("url", "https://github.com/Javen205/IJPay");
//        String emailContent = templateEngine.process("emailTemp", context);
//
//        mailService.sendHtmlMail("479634319@qq.com", "这是模板邮件", emailContent);
//        System.out.println("发送成功");
//    }catch (Exception ex){
//        ex.printStackTrace();
//        return null;
//    }

}
