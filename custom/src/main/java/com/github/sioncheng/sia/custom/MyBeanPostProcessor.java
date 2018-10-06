package com.github.sioncheng.sia.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("=============== postProcessBeforeInitialization " + s);
        Util.printCallstack();

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("=============== postProcessAfterInitialization " + s);
        Util.printCallstack();

        return o;
    }
}
