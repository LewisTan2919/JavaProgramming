package CreationalPattern.Builder;

public class run {


    public static void main(String[] args) {
        PCBuilder builder=new PCBuilder();
        PC pc=builder
                .setMonitor("DELL")
                .setKeyBoard("Logitech")
                .setCpu("Intel")
                .setGpu("Nvidia")
                .build();
        System.out.println(pc.toString());
    }
}
