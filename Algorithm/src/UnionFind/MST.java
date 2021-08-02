package UnionFind;


import java.util.PriorityQueue;
import java.util.Queue;

public class MST {

    public static int getMSTTotalWeight(int[][]edges,int n){
        Queue<int[]> q=new PriorityQueue<>((a, b)->{
            return a[2]-b[2];
        });
        for(int[]edge:edges){
            q.add(edge);
        }

        int[]roots=new int[n+1];
        for(int i=1;i<=n;i++){
            roots[i]=i;
        }
        int res=0;
        while(!q.isEmpty()){
            int[]edge=q.poll();
            int xroot=find(roots,edge[0]);
            int yroot=find(roots,edge[1]);
            if(xroot==yroot){
                continue;
            }
            roots[xroot]=yroot;
            res+=edge[2];
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(i==roots[i]){
                count++;
            }
            if(count>1){
                return -1;
            }
        }
        return res;
    }

    private static int find(int[]roots,int cur){

        while(cur!=roots[cur]){
            roots[cur]=roots[roots[cur]];
            cur=roots[cur];
        }
        return cur;
    }
}
