package com.example.demoaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BankingAspect {

    @Before("execution(* com.example.demoaop.service.TransferService.*(..))")
    public void logBefore(){
        System.out.println("Starting transferMoney...");

    }
}
