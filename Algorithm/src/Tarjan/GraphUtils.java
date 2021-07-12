package Tarjan;
import java.util.*;

public class GraphUtils {
    public static Map<Integer,List<Integer>> BuildGraph(int[][]edges){
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int[]edge:edges){
            if(!map.containsKey(edge[0])){
                map.put(edge[0],new ArrayList<>());
            }
            if(!map.containsKey(edge[1])){
                map.put(edge[1],new ArrayList<>());
            }
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        return map;
    }
}
