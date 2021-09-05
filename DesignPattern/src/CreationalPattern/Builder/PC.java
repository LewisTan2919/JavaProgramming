package CreationalPattern.Builder;

public class PC {
    @Override
    public String toString() {
        return "PC{" +
                "monitor='" + monitor + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", gpu='" + gpu + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    private String monitor;
    private String keyboard;
    private String gpu;
    private String cpu;
    public PC(String monitor,String keyboard,String gpu, String cpu){
        this.monitor=monitor;
        this.keyboard=keyboard;
        this.gpu=gpu;
        this.cpu=cpu;
    }
}
