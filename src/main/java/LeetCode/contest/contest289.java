package LeetCode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class contest289 {
    public String digitSum(String s, int k){
        if(s.length()<=k){
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length(); i+=k) {
            int sum = 0;
            for(int j =i ;j<i+k && j<s.length();j++){
                sum += s.charAt(j) - '0';
            }
            result += sum;
        }
        return digitSum(result,k);
    }


    public int minimumRounds(int[] tasks){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int task:tasks) {
            map.put(task,map.getOrDefault(task,0)+1);
        }
        int res =0 ;
        for (int value: map.values()) {
            if(value ==1) return -1;
            res +=(value+2)/3;
        }
        return res;
    }

//    public int maxTrailingZeros(int[][] grid){
//        int dp1[][][] = new int[grid.length+1][grid[0].length+1][2],
//                dp2[][][] = new int[grid.length+1][grid[0].length+1][2],max = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for(int j = 0;j <grid[0].length;j++){
//                dp1[i+1][j+1] = new int[]{dp1[i][j+1][0],dp1[i][j+1][1]};
//                dp2[i+1][j+1] = new int[]{dp2[i+1][j][0],dp2[i+1][j][1]};
//                for(;grid[i][j]%2 ==0;grid[i][j]/=2){
//                    dp1[i+1][j+1][0]++;
//                    dp2[i+1][j+1][0]++;
//                }
//                for(;grid[i][j]%5 ==0;grid[i][j]/=5){
//                    dp1[i+1][j+1][1]++;
//                    dp2[i+1][j+1][1]++;
//                }
//            }
//        }
//        for (int i = 1; i <=grid.length ; i++) {
//            for (int j =1;j<=grid[0].length ;j++){
//                max = Math.max(max,Math.max(Math.min(dp1[i][j][0]+dp2[i][j-1][0],dp1[i][j][1]+dp2[i][j-1][1]),
//                        Math.max(Math.min(dp1))));
//            }
//        }
//    }
//    public int longestPath(int[] parent,String s){
//        ArrayList<Integer>[] list = new ArrayList[parent.length];
//        for (int i = 0; i < parent.length; i++) {
//            list[i] = new ArrayList<>();
//        }
//        for (int i = 1; i < parent.length; i++) {
//            list[parent[i]].add(i);
//        }
//        return longestPath(0,s,list)[1];
//    }
//
//    public int[] longestPath(int index,String s, ArrayList<Integer>[] list){
//        int max = 0;
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for(int i :list[index]){
//            int[] result = longestPath(i,s,list);
//            max = Math.max((max, result[1]);
//            if(s.charAt(i) != s.charAt(index))){
//                queue.offer(-result[0]);
//            }
//        }
//        return  new int[]
//    }



}
