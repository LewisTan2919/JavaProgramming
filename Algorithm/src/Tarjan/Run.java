package Tarjan;

import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        int[][]edges=new int[][]{{0,1},{1,2},{0,2},{1,3},{4,5}};
        Map<Integer, List<Integer>> map=GraphUtils.BuildGraph(edges);
        System.out.println(map);
        System.out.println(CycleHandler.findCycle(map));

    }
}
