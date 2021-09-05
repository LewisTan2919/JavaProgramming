package StructuralPattern.FlyWeight;

public class TreeType {
    private String color;
    private String texture;

    @Override
    public String toString() {
        return "TreeType{" +
                "color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }

    public TreeType(String color, String texture){
        this.color=color;
        this.texture=texture;
    }
}
