package Tarjan;

import java.util.*;

public class CycleHandler {

    private static int[]low;
    private static int[]depths;
    private static int depth;

    public static Map<Integer,List<Integer>> findCycle(Map<Integer,List<Integer>> map){
        Map<Integer,List<Integer>> res=new HashMap<>();
        int size=map.size();
        low=new int[size];
        depths=new int[size];
        Arrays.fill(depths, -1);
        Arrays.fill(low, Integer.MAX_VALUE);
        depth=0;
        for(int source:map.keySet()){
            dfs(map,low,depths,source,-1);
        }
        for(int i=0;i<low.length;i++){
            if(!res.containsKey(low[i])){
                res.put(low[i],new ArrayList<>());
            }
            res.get(low[i]).add(i);
        }
        return res;
    }

    private static void dfs(Map<Integer,List<Integer>> map,int[]low,int[]depths,int cur,int pre){
        if(cur<0||cur>=depths.length||depths[cur]!=-1){
            return;
        }
        depths[cur]=depth++;
        low[cur]=depths[cur];
        for(int next:map.get(cur)){
            if(pre!=next){
                dfs(map,low,depths,next,cur);
                low[cur]=Math.min(low[cur],low[next]);
            }
        }
    }
}
