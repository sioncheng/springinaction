package com.github.sioncheng.sia.custom;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class PointBeanSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("=================== " + PointBeanSelector.class.getName());
        Map<String, Object> attributes =
                importingClassMetadata.getAnnotationAttributes(EnablePointBean.class.getName());

        for (Map.Entry<String, Object> attribute:
            attributes.entrySet()){
            System.out.println(attribute.getKey() + " <--> " + attribute.getValue());
        }
        return new String[0];
    }
}
