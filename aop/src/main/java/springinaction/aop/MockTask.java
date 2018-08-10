package springinaction.aop;

public class MockTask implements ITask {

    public void execute(TaskExecutionContext context) {
        System.out.println("MockTask#execute");
    }
}
