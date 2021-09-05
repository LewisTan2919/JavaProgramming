package BehavioralPattern.Strategy;

public class AddStrategy implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a+b;
    }
}
