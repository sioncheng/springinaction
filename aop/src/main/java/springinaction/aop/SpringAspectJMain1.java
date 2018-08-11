package springinaction.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAspectJMain1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-1.xml");

        Foo fooProxy = (Foo) applicationContext.getBean("target");
        fooProxy.method1();
        fooProxy.method2();
    }
}
