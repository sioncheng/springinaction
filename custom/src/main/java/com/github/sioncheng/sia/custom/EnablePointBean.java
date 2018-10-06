package com.github.sioncheng.sia.custom;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import({PointBean.class, PointBeanSelector.class, CustomPointBeanRegistrar.class})
@Import(CustomPointBeanRegistrar.class)
public @interface EnablePointBean {

    String[] values() default {""};
}
