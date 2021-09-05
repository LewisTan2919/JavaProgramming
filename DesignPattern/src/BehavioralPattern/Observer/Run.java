package BehavioralPattern.Observer;

public class Run {
    public static void main(String[] args) {
        Publisher publisher=new Publisher();
        Subscriber favorite=new FavoriteSubscriber();
        Subscriber found=new FoundSubscriber();

        publisher.subscribe(favorite);
        publisher.subscribe(found);

        publisher.next("state 1");
        publisher.next("state 2");
    }
}
