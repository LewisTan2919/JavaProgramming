package CreationalPattern.Prototype;

public class BlackShape extends Shape{

    private String color;

    public BlackShape(int length,int width,String color){

        super(length,width);
        this.color=color;
    }

    public BlackShape(BlackShape blackShape){
        super(blackShape);
        this.color=blackShape.color;
    }

    public BlackShape clone(){
        return new BlackShape(this);
    }
}
