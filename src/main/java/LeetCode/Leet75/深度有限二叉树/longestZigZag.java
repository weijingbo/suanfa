package LeetCode.Leet75.深度有限二叉树;

import Base.Tree.TreeNode;

public class longestZigZag {
    public int longestZigZag(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(dfs(root.left,false,0),
                dfs(root.right,true,0));
    }

    //定义向左为false，向右为ture
    public int dfs(TreeNode root,boolean flag,int length){
        if(root==null){
            return length;
        }
        if(flag){
            return Math.max(dfs(root.left,false,1+length),
                    dfs(root.right,true,0));
        }else {
            return Math.max(dfs(root.left,false,0),
                    dfs(root.right,true,1+length));
        }


    }
}
