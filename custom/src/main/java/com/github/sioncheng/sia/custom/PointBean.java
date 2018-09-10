package com.github.sioncheng.sia.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PointBean implements
        BeanNameAware, BeanFactoryAware, BeanPostProcessor {

    public PointBean() {

    }

    public void setBeanName(String s) {
        System.out.println("=============== set bean name " + s);
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("=============== set bean factory " + beanFactory);
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("=============== postProcessBeforeInitialization " + s);
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("=============== postProcessAfterInitialization " + s);
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }

        return o;
    }

    public void init() {
        System.out.println("=============== init");
        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", this.x, this.y);
    }

    private int x;

    private int y;
}
