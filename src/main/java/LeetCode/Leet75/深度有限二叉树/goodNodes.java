package LeetCode.Leet75.深度有限二叉树;

import Base.Tree.TreeNode;

public class goodNodes {
    int count=0;
    public int goodNodes(TreeNode root) {
        dfs(root.left,root.val);
        dfs(root.right,root.val);
        return count+1;
    }

    public void dfs(TreeNode root,Integer max){
        if(root==null) {
            return;
        }
        if(root.val>=max){
            count++;
            max = root.val;
        }
        dfs(root.left,max);
        dfs(root.right,max);
    }
}
