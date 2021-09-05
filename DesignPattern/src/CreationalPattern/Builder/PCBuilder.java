package CreationalPattern.Builder;

public class PCBuilder {
    private String monitor;
    private String keyboard;
    private String gpu;
    private String cpu;

    public PCBuilder(){

    }

    public PCBuilder setMonitor(String monitor){
        this.monitor=monitor;
        return this;
    }

    public PCBuilder setKeyBoard(String keyboard){
        this.keyboard=keyboard;
        return this;
    }

    public PCBuilder setGpu(String gpu){
        this.gpu=gpu;
        return this;
    }

    public PCBuilder setCpu(String cpu){
        this.cpu=cpu;
        return this;
    }

    public PC build(){
        return new PC(monitor,keyboard,gpu,cpu);
    }
}
