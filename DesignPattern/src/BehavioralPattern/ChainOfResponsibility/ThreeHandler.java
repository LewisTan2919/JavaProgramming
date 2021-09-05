package BehavioralPattern.ChainOfResponsibility;

public class ThreeHandler implements Handler{

    Handler next;
    @Override
    public void handle(Request request) throws Exception {
        if(request.getNum()==3){
            throw new Exception("equals 3");
        }else{
            if(next==null){
                return;
            }
            next.handle(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
        this.next=handler;
    }
}
