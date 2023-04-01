package LeetCode.TwentyThree.March;

import java.util.HashSet;

public class findSubarrays {
    public static boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            int temp = nums[i]+nums[i+1];
            if(set.contains(temp)){
                return true;
            }else {
                set.add(temp);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[]{4, 2, 5}));
    }
}
