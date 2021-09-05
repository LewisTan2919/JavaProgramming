package StructuralPattern.Proxy;

public class run {
    public static void main(String[] args) {
        Service service=new Service();
        ServiceProxy serviceProxy=new ServiceProxy(service);
        serviceProxy.work("word","123456");

        serviceProxy.work("true","2222");
    }
}
