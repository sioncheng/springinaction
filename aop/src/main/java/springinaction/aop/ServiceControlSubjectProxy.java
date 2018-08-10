package springinaction.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceControlSubjectProxy implements ISubject {

    public ServiceControlSubjectProxy(ISubject subject) {
        this.subject = subject;
    }

    public String request() {
        logger.info("ServiceControlSubjectProxy#request");

        return "Proxied-" + this.subject.request();
    }

    private ISubject subject;

    private static final Logger logger = LoggerFactory.getLogger(ServiceControlSubjectProxy.class);
}
