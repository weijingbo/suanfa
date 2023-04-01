package jianzhioffer;

import java.util.HashMap;
import java.util.HashSet;

public class search {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return map.getOrDefault(target,0);
    }
}
