package com.github.sioncheng.sia.custom;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class CustomPointBeanRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("==================== " + CustomPointBeanRegistrar.class.getName());

        String[] values = null;
        Map<String, Object> attributes =
                importingClassMetadata.getAnnotationAttributes(EnablePointBean.class.getName());
        for (Map.Entry<String, Object> attribute :
                attributes.entrySet()) {
            if (attribute.getKey().equals("values")) {
                values = (String[])attribute.getValue();
            }
        }

        BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(PointBean.class)
                .addPropertyValue("x", values[0])
                .addPropertyValue("y", values[1])
                .getBeanDefinition();

        registry.registerBeanDefinition("Point100", beanDefinition);
    }
}
