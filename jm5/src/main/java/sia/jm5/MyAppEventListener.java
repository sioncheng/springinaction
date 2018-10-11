package sia.jm5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyAppEventListener implements ApplicationListener<MyAppEvent> {

    public void onApplicationEvent(MyAppEvent event) {
        System.out.println(event);
    }
}
