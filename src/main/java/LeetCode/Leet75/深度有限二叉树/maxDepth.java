package LeetCode.Leet75.深度有限二叉树;

import Base.Tree.TreeNode;

public class maxDepth {
    public int max = 0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int level = 1;
        dfs(root,level);
        return max;
    }

    public void dfs(TreeNode root,int level){
        if(root==null) return;
        level++;
        max = Math.max(level,max);
        if(root.left!=null){
            dfs(root.left,level);
        }
        if(root.right!=null){
            dfs(root.right,level);
        }
    }

}
