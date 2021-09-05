package BehavioralPattern.ChainOfResponsibility;

public class OneHandler implements Handler {


    Handler next;
    @Override
    public void handle(Request request) throws Exception {

        if(request.getNum()==1){
            throw new Exception("equals 1");
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
