package BehavioralPattern.Iterator;

public class Run {
    public static void main(String[] args) {
        TreeNode t=TreeUtil.buildTree(4);
        Iterator<TreeNode> iterator=new BFSTreeIterator(t);
        while(iterator.hasMore()){
            System.out.print(iterator.next().val+" ");
        }
        TreeUtil.printTree(t);
    }
}
