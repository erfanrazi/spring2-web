package com.example.spring2web;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    //@Around("execution(* com.example.spring2web.HelloWorld.*(..))")
    @Around("")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("log...");
        return joinPoint.proceed();
    }

}
