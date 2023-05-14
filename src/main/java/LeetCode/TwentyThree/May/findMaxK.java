package LeetCode.TwentyThree.May;

import java.util.Arrays;
import java.util.HashSet;

public class findMaxK {
    public static int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = -1;
        for(int num:nums){
            if(set.contains(Math.negateExact(num))){
                res = Math.max(res,Math.abs(num));
            }else {
                set.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{-1,2,-3,3};
        int[] nums2 = new int[]{-1,10,6,7,-7,1};
        int[] nums3 = new int[]{14,33,40,-33,8,-24,-42,30,-18,-34};
//        System.out.println(findMaxK(nums1));
//        System.out.println(findMaxK(nums2));
        System.out.println(findMaxK(nums3));
    }
}
