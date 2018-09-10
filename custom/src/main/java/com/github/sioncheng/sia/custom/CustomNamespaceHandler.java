package com.github.sioncheng.sia.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        this.registerBeanDefinitionParser("point", new CustomBeanDefinitionParser(PointBean.class));
    }
}
