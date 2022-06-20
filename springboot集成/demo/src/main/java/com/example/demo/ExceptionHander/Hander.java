package com.example.demo.ExceptionHander;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Hander {
    @ExceptionHandler(Exception.class)
    public String exception(Exception e){
        if (e instanceof ArrayIndexOutOfBoundsException)
        {
            return "抱歉了，数组出错了";
        }
        if (e instanceof ArithmeticException)
            return "除以零了";
        return "不知道啥错误";
    }
    @ExceptionHandler(ArithmeticException.class)
    public String EXce(ArithmeticException e){
        return "J进入更详细里面的了";
    }
}

