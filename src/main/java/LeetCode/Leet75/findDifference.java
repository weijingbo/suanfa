package LeetCode.Leet75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        HashSet<Integer> diff = new HashSet<>(set1);
        diff.retainAll(set2);
        set1.clear();
        set2.clear();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums1) {
            if(!diff.contains(i) && !set1.contains(i)){
                list1.add(i);
                set1.add(i);
            }
        }
        for (int i : nums2) {
            if(!diff.contains(i) && !set2.contains(i)){
                list2.add(i);
                set2.add(i);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}
