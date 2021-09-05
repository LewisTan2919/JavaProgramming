package BehavioralPattern.Observer;

public class FavoriteSubscriber implements Subscriber {
    @Override
    public void receive(String event) {
        System.out.println("Favorite event: "+event);
    }
}
