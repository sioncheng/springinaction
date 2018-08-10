package springinaction.aop;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class RequestCtrlCallback implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable{
        if (method.getName().equals("request")) {
            return "Intercepted-" + methodProxy.invokeSuper(o, objects);
        } else {
            return null;
        }
    }
}
