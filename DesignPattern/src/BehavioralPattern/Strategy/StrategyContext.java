package BehavioralPattern.Strategy;

public class StrategyContext {

    private Strategy cur;

    public StrategyContext(){

    }

    public void setStrategy(Strategy strategy){
        this.cur=strategy;
    }

    public double execute(double a,double b){
        return this.cur.execute(a,b);
    }
}
