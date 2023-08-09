package LeetCode.Leet75;

import java.util.*;

import java.util.stream.Collectors;

public class equalPairs {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            List<Integer> collect = Arrays.stream(grid[i]).boxed().collect(Collectors.toList());
            map.put(collect,map.getOrDefault(collect,0)+1);
        }
        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                arrayList.add(grid[j][i]);
            }
            if(map.containsKey(arrayList)){
                ans+=map.get(arrayList);
            }
        }
        return ans;
    }
}
