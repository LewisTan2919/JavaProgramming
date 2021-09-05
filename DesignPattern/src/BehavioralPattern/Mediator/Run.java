package BehavioralPattern.Mediator;

public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        ComponentAdd componentAdd=new ComponentAdd();
        ComponentSpace componentSpace=new ComponentSpace();
        mediator.setComponent(componentAdd);
        mediator.setComponent(componentSpace);

        componentAdd.add("add");
        componentSpace.addSpace(10);
        componentAdd.add("component");

        System.out.println(mediator.getText());

    }
}
