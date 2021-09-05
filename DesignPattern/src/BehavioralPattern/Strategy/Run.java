package BehavioralPattern.Strategy;

public class Run {
    public static StrategyContext strategyContext;
    public static void main(String[] args) {
        strategyContext=new StrategyContext();

        execute("add",1,2);
        execute("sub",2,3);


    }

    public static void execute(String s, double a,double b){
        switch (s){
            case"add":
                strategyContext.setStrategy(new AddStrategy());
                break;
            case "sub":
                strategyContext.setStrategy(new SubStrategy());
                break;
        }
        System.out.println(strategyContext.execute(a,b));
    }
}
