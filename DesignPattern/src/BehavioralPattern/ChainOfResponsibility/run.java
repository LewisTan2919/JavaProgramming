package BehavioralPattern.ChainOfResponsibility;

public class run {
    public static void main(String[] args) {
        Handler one=new OneHandler();
        Handler two=new TwoHandler();
        Handler three=new ThreeHandler();

        three.setNext(two);
        two.setNext(one);

        try{
            three.handle(new Request(2));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
