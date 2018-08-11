package springinaction.aop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class AspectJProxyMain {

    public static void main(String[] args) {
        AspectJProxyFactory waver = new AspectJProxyFactory();
        waver.setProxyTargetClass(true);
        waver.setTarget(new Foo());
        waver.addAspect(PerformanceTraceAspect.class);

        Foo proxy = waver.getProxy();
        proxy.method1();
        proxy.method2();
    }
}
