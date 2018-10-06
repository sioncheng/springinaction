package com.github.sioncheng.sia.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnablePointBean(values = {"1", "2"})
public class EnablePointBeanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(EnablePointBeanMain.class);

        System.out.println(applicationContext.getBean(PointBean.class));
    }
}
