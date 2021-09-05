package BehavioralPattern.Mediator;

public class ComponentSpace implements Component {
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public String getName() {
        return "Space";
    }

    public void addSpace(int num){
        this.mediator.addSpace(num);
    }
}
