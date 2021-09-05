package BehavioralPattern.Observer;
import java.util.*;
public class Publisher {
    private List<Subscriber>observers;
    private String state;
    public Publisher(){
        this.observers=new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        this.observers.add(subscriber);
    }

    public void next(String nextState){
        this.state=nextState;
        observers.stream().forEach(subscriber -> {
            subscriber.receive(nextState);
        });
    }
}
