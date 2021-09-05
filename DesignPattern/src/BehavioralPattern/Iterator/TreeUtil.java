package BehavioralPattern.Iterator;

import StructuralPattern.FlyWeight.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {
    private static int curVal=1;

    public static TreeNode buildTree(int depth){
        curVal=1;
        TreeNode root=new TreeNode(1);

        int curLevel=1;
        dfs(root,1,depth);

        return root;
    }

    private static void dfs(TreeNode cur,int level,int targetDepth){
        if(level==targetDepth){
            return;
        }
        TreeNode left=new TreeNode(++curVal);
        TreeNode right=new TreeNode(++curVal);

        cur.left=left;
        cur.right=right;
        //System.out.println(cur.val);

        dfs(cur.left,level+1,targetDepth);
        dfs(cur.right,level+1,targetDepth);

    }

    public static void printTree(TreeNode root){
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            System.out.println("");
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                System.out.print(cur.val+"  ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }

}
