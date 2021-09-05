package BehavioralPattern.Iterator;

import java.util.*;


public class BFSTreeIterator implements Iterator<TreeNode> {
    private TreeNode treeNode;
    private List<TreeNode> list;
    private int size;
    private int cur;
    public BFSTreeIterator(TreeNode treeNode){
        this.treeNode=treeNode;
        this.list=new ArrayList<>();
        BFS();
        size=list.size();
        cur=0;
    }


    @Override
    public TreeNode next() {
        if(!hasMore()){
            return null;
        }
        return list.get(cur++);
    }

    @Override
    public boolean hasMore() {
        return cur<list.size();
    }

    private void BFS(){
        Queue<TreeNode>q=new LinkedList<>();
        q.add(this.treeNode);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                this.list.add(cur);
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
