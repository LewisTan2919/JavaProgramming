package CreationalPattern.Prototype;

public abstract class Shape {
    private int length;
    private int width;
    public Shape(int length,int width){
        this.length=length;
        this.width=width;
    }

    public Shape(Shape s){
        this.length=s.length;
        this.width=s.width;
    }
}
