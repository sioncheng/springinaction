package sia.jm5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppEventMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfiguration.class);

        MyAppEventPublisher myAppEventPublisher = applicationContext.getBean(MyAppEventPublisher.class);

        myAppEventPublisher.publishEvent();
    }
}
