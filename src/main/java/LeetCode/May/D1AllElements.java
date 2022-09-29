package LeetCode.May;

import java.util.ArrayList;
import java.util.List;


public class D1AllElements {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        order(root1,nums1);
        order(root2,nums2);
        List<Integer> res = new ArrayList<>();
        int p1=0,p2=0;
        while(true){
            if(p1 == nums1.size()-1){
                res.addAll(nums2.subList(p2,nums2.size()));
                break;
            }
            if(p2 == nums2.size()-1){
                res.addAll(nums1.subList(p1, nums1.size()));
                break;
            }
            if(nums1.get(p1)<=nums2.get(p2)){
                res.add(nums1.get(p1));
                p1++;
            }else{
                res.add(nums2.get(p2));
                p2++;
            }
        }
        return res;
    }
    public void order(TreeNode tree,List<Integer> res){
        if(tree ==null) return;
        order(tree.left,res);
        res.add(tree.val);
        order(tree.right,res);
    }
}
