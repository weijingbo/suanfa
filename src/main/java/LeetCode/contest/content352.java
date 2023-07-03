package LeetCode.contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class content352 {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int l =0,r=0;
        int res =0;
        while(l<nums.length){
            if(nums[l]%2==0 && nums[l]<=threshold){
                r=l;
                while(r< nums.length-1 && nums[r+1]<=threshold && nums[r]<=threshold && nums[r]%2 !=nums[r+1]%2){
                   r++;
                }
                res = Math.max(res,r-l+1);
                l=r;
            }
            l++;
        }
        return res;
    }

    private static HashSet<Integer> set = new HashSet<>() {
        {
            boolean[] flag = new boolean[1000000];
            for (int i = 2; i < flag.length; i++) {
                if (!flag[i]) {
                    add(i);
                    for (int j = i; j < flag.length; j += i) {
                        flag[j] = true;
                    }
                }
            }
        }
    };

    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (set.contains(i) && set.contains(n - i)) {
                list.add(List.of(i, n - i));
            }
        }
        return list;
    }


    public long continuousSubarrays(int[] nums) {
        long count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0, j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            for (; map.lastKey() - map.firstKey() > 2; i++) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
            }
            count += j - i + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,2,5,4};
        int[] nums2 = new int[]{1,2};
        int[] nums3 = new int[]{2,3,4,5};
        int[] nums4 = new int[]{4};
//        System.out.println(longestAlternatingSubarray(nums4,1));
        content352 content352 = new content352();
        System.out.println(content352.findPrimePairs(10));


    }
}
