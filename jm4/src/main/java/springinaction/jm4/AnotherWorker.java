package springinaction.jm4;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherWorker implements IWorker, InitializingBean {

    @Autowired
    private ITool tool;

    public void work() {
        tool.knock();
    }

    public void afterPropertiesSet() {
        System.out.println("=== AnotherWorker#afterPropertiesSet");
    }
}
