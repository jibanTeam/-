package com.example.app.Interceptor;

import com.example.app.currency.userInfo;
import com.example.app.module.login.entity.LoginUserExample;
import com.example.app.module.login.mapper.LoginUserMapper;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//拦截器
@Service
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {       //请求进入这个拦截器
        HttpSession session = request.getSession();
        if (session.getAttribute("userName") != null && session.getAttribute("password") != null) {       //判断session中有没有userName信息


            String userName = session.getAttribute("userName") + "";
            String password = session.getAttribute("password") + "";

            //建立线程变量,存储session信息
            userInfo.add(userName, password);
            return true;

        }
        response.sendRedirect("/public/register");
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
