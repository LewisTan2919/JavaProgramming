package BehavioralPattern.ChainOfResponsibility;

public interface Handler {
    void handle(Request request) throws Exception;
    void setNext(Handler handler);
}
