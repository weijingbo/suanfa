package LeetCode.BinarySearch;

import java.util.*;

public class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int ele:nums1) {
            map1.put(ele,map1.getOrDefault(ele,0)+1);
        }
        for (int ele:nums2) {
            map2.put(ele,map2.getOrDefault(ele,0)+1);
        }
        for (int k : map1.keySet()) {
            int temp = Math.min(map1.get(k),map2.getOrDefault(k,0));
            for (int i = 0; i < temp; i++) {
                ans.add(k);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
