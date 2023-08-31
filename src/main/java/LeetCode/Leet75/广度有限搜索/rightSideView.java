package LeetCode.Leet75.广度有限搜索;

import Base.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class rightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while(deque.size()>=1){
            ArrayDeque<TreeNode> temp = new ArrayDeque<>();
            while(deque.size()>1){
                TreeNode tempNode = deque.poll();
                if(tempNode.left!=null)  temp.add(tempNode.left);
                if(tempNode.right!=null)  temp.add(tempNode.right);
            }
            TreeNode tempNode = deque.poll();
            res.add(tempNode.val);
            if(tempNode.left!=null)  temp.add(tempNode.left);
            if(tempNode.right!=null)  temp.add(tempNode.right);
            deque = temp;
        }
        return res;
    }
}
