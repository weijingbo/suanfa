package LeetCode.contest;

import java.util.*;

public class content317 {
    public int averageValue(int[] nums) {
        int res = 0;
        int total = 0;
        for (int num:nums) {
            if(num%6==0){
                res+=num;
                total++;
            }
        }
        if(total==0) {
            return 0;
        }else {
            return res/total;
        }
    }

    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,Long> map = new HashMap<>();
        HashMap<String,PriorityQueue<Integer>> createToId = new HashMap<>();
        long max = 0;
        for (int i = 0; i < creators.length; i++) {
            createToId.computeIfAbsent(creators[i],t->new PriorityQueue<>(
                    (a,b)->views[a]==views[b]? ids[a].compareTo(ids[b]):views[b]-views[a])).offer(i);
            map.put(creators[i],map.getOrDefault(creators[i],0L)+views[i]);
            max = Math.max(max,map.get(creators[i]));
        }
        for(String key: map.keySet()){
            if(map.get(key)==max){
                res.add(List.of(key,ids[createToId.get(key).peek()]));
            }
        }
        return res;
    }
    


    public long makeIntegerBeautiful(long n, int target) {
        long temp = n;
        ArrayDeque<Long> deque = new ArrayDeque<>();
        while(temp>0){
            deque.addLast((long)temp%10);
            temp = temp/10;
        }
        System.out.println(deque);
        //考虑最极端的情况 9999 1
        temp = n;
        long base = 1;
        int total = getTotal(temp);
        boolean isTen =true;
        while(total>target){
            if (isTen) {
                temp+= (10-deque.pop())*base;
                isTen =false;
            }else{
                temp+= (9-deque.pop())*base;
            }
            total = getTotal(temp);
            base *=10;
        }
        return temp-n;
    }

    public int getTotal(long n){
        int total=0;
        while(n>0){
            total+=n%10;
            n=n/10;
        }
        return total;
    }



    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//        public int[] treeQueries(TreeNode root, int[] queries) {
//
//        }
    public static void main(String[] args) {
        content317 content317 = new content317();
        System.out.println(content317.mostPopularCreator(new String[]{"a","a"},new String[]{"a","aa"},new int[]{5,5}));
//        System.out.println(content317.makeIntegerBeautiful(5756554100L ,26));
    }
}
