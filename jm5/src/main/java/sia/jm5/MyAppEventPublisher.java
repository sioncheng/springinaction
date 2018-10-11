package sia.jm5;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyAppEventPublisher implements ApplicationEventPublisherAware {

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent() {
        applicationEventPublisher.publishEvent(new MyAppEvent(this));
    }

    private ApplicationEventPublisher applicationEventPublisher;
}
