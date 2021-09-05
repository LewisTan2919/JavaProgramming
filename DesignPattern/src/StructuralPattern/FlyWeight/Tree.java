package StructuralPattern.FlyWeight;

public class Tree {
    private int x;
    private int y;

    //since some state are repeating we can reuse this
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", treeType=" + treeType +
                '}';
    }
}
