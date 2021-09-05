package BehavioralPattern.Observer;

public class FoundSubscriber implements Subscriber {
    @Override
    public void receive(String event) {
        System.out.println("find new state: "+event);
    }
}
