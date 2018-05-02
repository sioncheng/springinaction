package com.springinaction.ch4;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(** com.springinaction.ch4.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silence cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("take seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("demanding refund");
    }
}
