package LeetCode.TwentyThree.January;

import java.util.*;

public class findingUsersActiveMinutes {

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
        for (int[] log : logs) {
            if(map.containsKey(log[0])){
                map.get(log[0]).add(log[1]);
            }else {
                HashSet<Integer> set = new HashSet<>();
                set.add(log[1]);
                map.put(log[0], set);
            }
        }
        int[] res = new int[k];
        Set<Map.Entry<Integer, HashSet<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, HashSet<Integer>> entry : entries) {
            int size = entry.getValue().size();
            res[size-1]++;
        }
        return res;
    }


    public static void main(String[] args) {
        findingUsersActiveMinutes f = new findingUsersActiveMinutes();
        System.out.println(Arrays.toString(f.findingUsersActiveMinutes(new int[][]{{1, 1}, {2, 2}, {2, 3}}, 4)));
    }

}
