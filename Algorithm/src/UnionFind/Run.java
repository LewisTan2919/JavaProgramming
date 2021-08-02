package UnionFind;

public class Run {
    public static void main(String[] args) {

        int[][]edges=new int[][]{{2,1,87129},{3,1,14707},{4,2,34505},{5,1,71766},{6,5,2615},{7,2,37352} };
        System.out.println(MST.getMSTTotalWeight(edges,7));
        edges=new int[][]{{1,2,5},{1,3,6},{2,3,1}};
        System.out.println(MST.getMSTTotalWeight(edges,3));

    }
}
