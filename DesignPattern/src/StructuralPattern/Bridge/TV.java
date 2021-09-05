package StructuralPattern.Bridge;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the TV");
    }
}
