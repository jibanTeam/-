package com.example.app.Interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;



@Configuration          //使用注解 实现拦截
public class WebAppConfigurer implements WebMvcConfigurer   {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截的管理器
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());     //拦截的对象会进入这个类中进行判断
        registration.addPathPatterns("/**");                    //所有路径都被拦截
        registration.excludePathPatterns("/",
                "/login/**",
                "/error",
                "/css/**",
                "/i/**",
                "/img/**",
                "/js/**",
                "/logout",
                "/register",
                "/public/**");       //添加不拦截路径
//        super.addInterceptors(registry);


    }

}