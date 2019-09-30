package com.example.app.module.login.server;

import com.example.app.currency.ResultData;
import com.example.app.module.login.entity.LoginUser;
import com.example.app.module.login.entity.loginVo;

import javax.servlet.http.HttpServletRequest;


public interface LoginServer {
    ResultData register(LoginUser entity);
    ResultData sendCode(String e);
    ResultData VerificationCode(String code,String email, HttpServletRequest request);
    ResultData login(HttpServletRequest request);
    ResultData userLogin(loginVo entity, HttpServletRequest request);
}
