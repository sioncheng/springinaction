package springinaction.aop;

import java.lang.reflect.Proxy;

public class ProxyMain {

    public static void main(String[] args) {
        ISubject subjectProxy = new ServiceControlSubjectProxy(new SubjectImpl());

        System.out.println(subjectProxy.request());

        ISubject subjectHandler = (ISubject) Proxy.newProxyInstance(ProxyMain.class.getClassLoader(),
                new Class[]{ISubject.class},
                new RequestInvocationHandler(new SubjectImpl()));
        subjectHandler.request();

        IRequest requestHandler = (IRequest) Proxy.newProxyInstance(ProxyMain.class.getClassLoader(),
                new Class[]{IRequest.class},
                new RequestInvocationHandler(new RequestImpl()));
        requestHandler.request();
    }
}
