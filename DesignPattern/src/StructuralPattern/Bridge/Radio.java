package StructuralPattern.Bridge;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("turn on the radio");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the radio");
    }
}
