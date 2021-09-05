package StructuralPattern.FlyWeight;

public class Forest {

    public Tree generateTree(int x,int y,String color,String texture){
        TreeType treeType=TreeTypeFactory.getTreeType(color, texture);
        return new Tree(x,y,treeType);
    }
}
