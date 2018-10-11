package springinaction.jm4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseBeanFactoryMain {

    public static void main(String[] args) {
        IWorker iWorker;
        //iWorker = getWorkerViaCode();
        //iWorker = getWorkerViaXmlConfig();
        iWorker = getWorkerViaAnnotation();

        iWorker.work();
    }

    private static IWorker getWorkerViaCode() {
        DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();

        RootBeanDefinition toolDef = new RootBeanDefinition(SomeTool.class);

        listableBeanFactory.registerBeanDefinition("tool", toolDef);

        RootBeanDefinition workerDef = new RootBeanDefinition(SomeWorker.class);
        workerDef.getPropertyValues().addPropertyValue("tool", toolDef);

        listableBeanFactory.registerBeanDefinition("worker", workerDef);

        return  listableBeanFactory.getBean("worker", IWorker.class);
    }

    private static IWorker getWorkerViaXmlConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        return context.getBean("worker", IWorker.class);
    }

    private static IWorker getWorkerViaAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WorkerConfig.class);

        return applicationContext.getBean(IWorker.class);
    }
}
