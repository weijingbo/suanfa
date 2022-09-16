package LeetCode.BinarySearch;

import java.util.Arrays;

public class findMin {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}

