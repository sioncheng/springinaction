package com.github.sioncheng.sia.custom;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class CustomBeanDefinitionParser implements BeanDefinitionParser {

    public  CustomBeanDefinitionParser(Class<?> tClass) {
        this.tClass = tClass;
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setLazyInit(false);
        rootBeanDefinition.setBeanClass(this.tClass);
        rootBeanDefinition.setInitMethodName("init");

        String id = element.getAttribute("id");
        int x = Integer.parseInt(element.getAttribute("x"));
        int y = Integer.parseInt(element.getAttribute("y"));

        rootBeanDefinition.getPropertyValues().addPropertyValue("x", x);
        rootBeanDefinition.getPropertyValues().addPropertyValue("y", y);

        parserContext.getRegistry().registerBeanDefinition(id, rootBeanDefinition);

        return rootBeanDefinition;
    }

    private Class<?> tClass;
}
