package LeetCode.zhijigangwei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        HashSet<Integer> resSet = new HashSet<>();
        for (int j : nums2) {
            if (set.contains(j)) {
                resSet.add(j);
            }
        }
        int[] ans = new int[resSet.size()];
        int i = 0;
        Iterator<Integer> iterator = resSet.iterator();
        while(iterator.hasNext()){
            ans[i] = iterator.next();
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        intersection intersection = new intersection();
        System.out.println(Arrays.toString(intersection.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
