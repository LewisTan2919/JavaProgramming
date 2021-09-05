package BehavioralPattern.Mediator;

public class ComponentAdd implements Component {
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;

    }

    public void add(String string){
        this.mediator.addString(string);
    }

    public String getName(){
        return "add";
    }
}
