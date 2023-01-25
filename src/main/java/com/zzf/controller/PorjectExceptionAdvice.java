package com.zzf.controller;


import com.zzf.exception.BuissnessException;
import com.zzf.exception.SyetemException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PorjectExceptionAdvice {
    @ExceptionHandler(SyetemException.class)
    public Result systemexp(SyetemException ex){
        System.out.println("抓到你了小子 ");
        return new Result(ex.getCode(),null,ex.getMessage());

    }
    @ExceptionHandler(BuissnessException.class)
    public Result Buinesstemexp(BuissnessException ex){
        System.out.println("抓到你了小子 ");
        return new Result(ex.getCode(),null,ex.getMessage());

    }
    @ExceptionHandler(Exception.class)
    public Result doexp(Exception ex){
        System.out.println("抓到你了小子 ");
        return new Result(500,null,"系统繁忙，请稍后再试");
    }
}
