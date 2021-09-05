package StructuralPattern.Bridge;

//we have client, when changes come to device, come back to 
public class Remote {
    private Device device;
    public Remote(Device device){
        this.device=device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
