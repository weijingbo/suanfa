package LeetCode.Leet75.广度有限搜索;

import Base.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class maxLevelSum {
    public int maxLevelSum(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        if(root == null) return 0;
        int max_sum = root.val;
        int level = 1;
        int res = 1;
        list.add(root);
        while(list.size()>0){
            ArrayList<TreeNode> temp = new ArrayList<>();
            int sum = 0;
            for(TreeNode node:list){
                sum+=node.val;
                if(root.left!=null){
                    temp.add(node.left);
                }
                if(root.right!=null){
                    temp.add(node.right);
                }
            }
           list = temp;
            if(sum>max_sum){
                max_sum = sum;
                res = level;
            }
            level++;
        }
        return res;
    }
}
