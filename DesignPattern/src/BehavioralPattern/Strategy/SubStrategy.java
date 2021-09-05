package BehavioralPattern.Strategy;

public class SubStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a-b;
    }
}
