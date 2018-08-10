package springinaction.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;


public class InterceptorMain {

    public static void main(String[] args) {
        //interfaceProxy();
        cglibProxy();
    }

    private static void interfaceProxy() {
        MockTask mockTask = new MockTask();
        ProxyFactory proxyFactory = new ProxyFactory(mockTask);
        proxyFactory.setInterfaces(new Class[]{ITask.class});
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMethodInterceptor());
        proxyFactory.addAdvisor(advisor);
        ITask proxyObject = (ITask) proxyFactory.getProxy();
        proxyObject.execute(new TaskExecutionContext());
    }

    private static void cglibProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new Executable());
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMethodInterceptor());
        proxyFactory.addAdvisor(advisor);
        Executable proxyObject = (Executable) proxyFactory.getProxy();
        proxyObject.execute(new TaskExecutionContext());
    }
}
