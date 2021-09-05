package BehavioralPattern.ChainOfResponsibility;

public class TwoHandler implements Handler{

    Handler next;

    @Override
    public void handle(Request request) throws Exception {
        if(request.getNum()==2){
            throw new  Exception("equals 2");
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
