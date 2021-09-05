package StructuralPattern.FlyWeight;

public class run {
    public static void main(String[] args) {
        String color="red";
        String texture="cold";
        Forest forest=new Forest();
        Tree tree=forest.generateTree(1,2,color,texture);
        System.out.println(tree);
    }
}
