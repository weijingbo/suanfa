package LeetCode.TwentyThree.April;

public class maxAncestorDiff {
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root, root.val, root.val);
        return ans;
    }
    public void dfs(TreeNode root, int min,int max){
        if(root==null){
            return ;
        }
        max = Math.max(max, root.val);
        min = Math.min(min,root.val);
        dfs(root.left,min,max);
        dfs(root.right,min,max);
        ans = Math.max(ans,max-min);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

