package com.springinaction.ch4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAround {

    @Pointcut("execution(** com.springinaction.ch4.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint pjp) {
        try {
            System.out.println("silence cell phones");
            System.out.println("taking seats");

            pjp.proceed();

            System.out.println("CLAP!!!");
        } catch (Throwable ex) {
            System.out.println("demanding a refund");
        }
    }
}
