package springinaction.jm4;

import org.springframework.stereotype.Component;

@Component
public class AnotherTool implements ITool {

    public void knock() {
        System.out.println("AnotherTool#knock");
    }
}
