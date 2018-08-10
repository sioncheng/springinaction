package springinaction.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestInvocationHandler implements InvocationHandler {

    public RequestInvocationHandler(Object o) {
        this.o = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("request")) {
            logger.info("RequestInvocationHandler#invoke");
            return "Handled-" + method.invoke(o, args);
        } else {
            return null;
        }
    }

    private Object o;

    private static final Logger logger = LoggerFactory.getLogger(RequestInvocationHandler.class);
}
