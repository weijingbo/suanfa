package LeetCode.TwentyThree.May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numOfMinutes {
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(manager[i],new ArrayList<Integer>());
            map.get(manager[i]).add(i);
        }
        return dfs(headID, informTime, map);
    }

    public static int dfs(int cur,int[] informTime,Map<Integer, List<Integer>> map ){
        int res=0;
        for (int neighbor : map.getOrDefault(cur, new ArrayList<Integer>())) {
            res = Math.max(res, dfs(neighbor, informTime, map));
        }
        return informTime[cur] + res;
    }

    public static void main(String[] args) {
        System.out.println(numOfMinutes(6,2,new int[]{2,2,-1,2,2,2},new int[]{0,0,1,0,0,0}));
    }
}
