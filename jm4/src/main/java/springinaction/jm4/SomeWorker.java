package springinaction.jm4;

public class SomeWorker implements IWorker {

    private ITool tool;

    public SomeWorker(){}

    public ITool getTool() {
        return tool;
    }

    public void setTool(ITool tool) {
        this.tool = tool;
    }

    public void work() {
        tool.knock();
    }
}
