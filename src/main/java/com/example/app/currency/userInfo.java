package com.example.app.currency;

import com.example.app.module.login.entity.loginVo;

import java.util.Map;

//线程实体，获取session信息
public class userInfo {

    private final static ThreadLocal<loginVo> requestSession = new ThreadLocal<>();
    public static void add(String userName,String password) {
        loginVo user=new loginVo();
        user.setUserName(userName);
        user.setPassword(password);
        requestSession.set(user);

    }

    public static loginVo getUser() {
        return requestSession.get();
    }



    public static void remove() {
        requestSession.remove();
    }
}
