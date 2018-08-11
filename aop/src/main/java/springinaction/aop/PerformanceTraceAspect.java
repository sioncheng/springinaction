package springinaction.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

@Aspect
public class PerformanceTraceAspect {

    @Pointcut("execution(public void *.method1()) || execution(public void *.method2())")
    public void pointcutName() {}

    @Around("pointcutName()")
    public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch watch = new StopWatch();

        try {
            watch.start();
            return joinPoint.proceed();
        } finally {
            watch.stop();

            logger.info("PerformanceTraceAspect {}", watch.getTotalTimeMillis());
        }
    }

    private static final Logger logger = LoggerFactory.getLogger(PerformanceTraceAspect.class);
}
