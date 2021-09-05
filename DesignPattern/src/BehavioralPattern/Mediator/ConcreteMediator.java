package BehavioralPattern.Mediator;

import java.util.stream.IntStream;

public class ConcreteMediator implements Mediator {

    private ComponentAdd componentAdd;
    private ComponentSpace componentSpace;

    private StringBuilder sb;

    public ConcreteMediator(){
        sb=new StringBuilder();
    }

    @Override
    public void setComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()){
            case("Add"):{
                componentAdd=(ComponentAdd)component;
                break;
            }
            case("Space"):{
                componentSpace=(ComponentSpace)component;
                break;
            }
            default:{

            }
        }
    }

    @Override
    public void addString(String s) {
        sb.append(s);
    }

    @Override
    public void addSpace(int num) {
        for(int i=0;i<num;i++){
            sb.append(" ");
        }
    }

    @Override
    public String getText() {
        return sb.toString();
    }


}
