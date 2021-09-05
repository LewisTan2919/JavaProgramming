package BehavioralPattern.Mediator;

public interface Mediator {
    public void setComponent(Component component);
    public void addString(String s);
    public void addSpace(int num);
    public String getText();
}
