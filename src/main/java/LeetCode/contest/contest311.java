package LeetCode.contest;

import java.util.*;
import java.util.stream.Collectors;

public class contest311 {
     public class TreeNode {
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
    public int longestContinuousSubstring(String s) {
        char[] chars = s.toCharArray();
        int ans = 1;
        int temp = 1;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]-chars[i-1]==1){
                temp+=1;
                ans = Math.max(ans,temp);
            }else {
                temp=1;
            }
        }
        return ans;
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        List<TreeNode> curr = new LinkedList<>();
        while(queue.size() > 0){
            for(int k = queue.size(); k > 0; k --){
                //curr.add(queue.poll());
                TreeNode t = queue.poll();
                if(t.left != null) queue.add(t.left);
                if(t.right != null) queue.add(t.right);
                curr.add(t);
            }
            if(depth % 2 != 0){
                for(int i = 0; i < curr.size() / 2; i ++){
                    TreeNode prev = curr.get(i);
                    TreeNode next = curr.get(curr.size() - i - 1);
                    int prevval = prev.val;
                    prev.val = next.val;
                    next.val = prevval;
                }
            }
            depth ++;
            curr.clear();
        }
        return root;
    }
    private void helper(TreeNode root, int depth){
        if(root ==  null) return;
        if(depth % 2 == 0){
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
        }
        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }

    public int[] sumPrefixScores(String[] words) {
        int[] ans = new int[words.length];
        HashMap<String,Integer> map = new HashMap<>();
        for (String word:words) {
            for (int i = 0; i < word.length(); i++) {
                map.put(word.substring(0,i+1),map.getOrDefault(word.substring(0,i+1),0)+1);
            }
        }
            for (int i = 0; i < words.length; i++) {
                int temp = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    temp+= map.get(words[i].substring(0,j+1));
                }
                ans[i] = temp;
            }
        return ans;
    }

    public static void main(String[] args) {
        contest311 contest311 = new contest311();
        //System.out.println(contest311.longestContinuousSubstring("abcde"));
        System.out.println(Arrays.toString(contest311.sumPrefixScores(new String[]{"b","abc", "ab", "bc", })));
    }
}
