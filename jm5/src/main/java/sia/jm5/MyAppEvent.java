package sia.jm5;

import org.springframework.context.ApplicationEvent;

public class MyAppEvent extends ApplicationEvent {

    public MyAppEvent(Object source) {
        super(source);
    }

}
