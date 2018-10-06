package com.github.sioncheng.sia.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class PointBean implements
        BeanNameAware, BeanFactoryAware, InitializingBean {

    public PointBean() {

    }

    public void setBeanName(String s) {
        System.out.println("=============== set bean name " + s);
        Util.printCallstack();
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("=============== set bean factory " + beanFactory);
        Util.printCallstack();
    }

    public void init() {
        System.out.println("=============== init");
        Util.printCallstack();
    }

    public void destroy() {
        System.out.println("=============== destroy");
        Util.printCallstack();
    }


    public void afterPropertiesSet() {
        System.out.println("=============== after properties set");
        Util.printCallstack();
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
