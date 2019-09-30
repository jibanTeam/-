package com.example.app.except;

import com.example.app.currency.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/*
异常统一拦截处理
 */
@Slf4j
@ControllerAdvice
class MyExceptionHandler {

//    @ExceptionHandler(ConstraintViolationException.class)
//    @ResponseBody
//    private String ArithmeticException(HttpServletRequest request, Exception e) {
//        System.out.println(e.get);
//        return "admin-404";
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseBody
//    private String MethodArgumentNotValidException(HttpServletRequest request, Exception e) {
//        System.out.println(e.getMessage());
//        return "admin-404";
//    }

    //参数校验异常拦截
    @ResponseBody
    @ExceptionHandler(BindException.class)
    public ResultData exceptionHandler(BindException e)
    {
        e.printStackTrace();

        return new ResultData(Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage(),"false");
    }
//    @ExceptionHandler(Exception.class)
//    private String except(HttpServletRequest request, Exception e) {
//        System.out.println(e.getMessage());
//        return "admin-404";
//    }

//    @ExceptionHandler(ArithmeticException.class)
//    @ResponseBody
//    private ResultData<Object> handlerErrorInfo(HttpServletRequest request, Exception e) {
//        System.out.println("GlobalException成功拦截");
//        log.error("{} Exception", request.getRequestURI(), e);
//        if (e instanceof BusinessException) {
//            return ServerResponse.createByErrorCodeMessage(((BusinessException) e).getCode(), e.getMessage());
//        } else {
//            return ServerResponse.createByErrorMessage("服务器异常,请联系管理员处理");
//        }
//    }

}
