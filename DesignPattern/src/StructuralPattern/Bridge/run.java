package StructuralPattern.Bridge;

public class run {
    public static void main(String[] args) {
        Device device=new TV();
        Remote remote=new Remote(device);
        remote.turnOff();
        remote.turnOn();
    }
}
