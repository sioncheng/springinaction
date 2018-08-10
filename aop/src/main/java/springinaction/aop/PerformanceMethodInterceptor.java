package springinaction.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;


public class PerformanceMethodInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        StopWatch watch = new StopWatch();

        try {
            watch.start();
            return methodInvocation.proceed();
        } finally {
            watch.stop();

            logger.info("performance {}", watch.getTotalTimeMillis());
        }
    }

    private static final Logger logger = LoggerFactory.getLogger(PerformanceMethodInterceptor.class);
}
