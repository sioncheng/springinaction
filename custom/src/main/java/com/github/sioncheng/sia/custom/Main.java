package com.github.sioncheng.sia.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-spring.xml");

        PointBean pointBean = (PointBean) context.getBean("p1");

        System.out.println(pointBean);

        Car car = (Car) context.getBean("car");

        System.out.println(car);

        ((ClassPathXmlApplicationContext) context).destroy();


    }
}
