package LeetCode.Leet75.深度有限二叉树;

import Base.Tree.TreeNode;

import java.util.ArrayList;

public class leafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        System.out.println(list1);
        System.out.println(list2);
        if(list1.size()!=list2.size()){return false;}
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)!=list2.get(i)){
                return false;
            }
        }

        return true;
    }

    public void dfs(TreeNode root,ArrayList<Integer> list){
        if(root.left==null && root.right ==null){
            list.add(root.val);
            return;
        }
        if(root.left!=null){
            dfs(root.left,list);
        }
        if(root.right!=null){
            dfs(root.right,list);
        }
    }


}
