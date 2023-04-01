package LeetCode.TwentyTwo.September;

import java.util.*;

public class findJudge {
    public int findJudge(int n, int[][] trust) {
        boolean[] judge = new boolean[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < trust.length; i++) {
            judge[trust[i][0]-1] = true;
            set.add(trust[i][1]-1);
        }
        for (int i = 0; i < n; i++) {
            if(!judge[i] && set.contains(i)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findJudge findJudge = new findJudge();
        System.out.println(findJudge.findJudge(3,new int[][]{{1,3},{2,3}}));
    }
}
