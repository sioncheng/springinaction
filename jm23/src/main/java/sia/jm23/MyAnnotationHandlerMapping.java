package sia.jm23;

import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.handler.AbstractDetectingUrlHandlerMapping;

import java.lang.reflect.Method;

public class MyAnnotationHandlerMapping extends AbstractDetectingUrlHandlerMapping {

    @Override
    protected String[] determineUrlsForHandler(String beanName) {

        ApplicationContext context = getApplicationContext();
        Class<?> handlerType = context.getType(beanName);

        if (handlerType.isAnnotationPresent(MyController.class)) {
            Method[] methods = handlerType.getDeclaredMethods();
            for (Method m :
                    methods) {

                MyRequestMapping mapping = AnnotationUtils.findAnnotation(m, MyRequestMapping.class);

                if (mapping != null) {
                    return new String[]{mapping.path()};
                }
            }
        }

        return new String[0];
    }
}
