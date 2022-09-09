package LeetCode.August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int temp = 0;
        int i = nums.length-1;
        List<Integer> ans = new ArrayList<>();
        while(temp<=sum-temp){
            temp+=nums[i];
            ans.add(nums[i]);
            i--;
        }
        return  ans;
    }

    public static void main(String[] args) {
        MinSubsequence minSubsequence = new MinSubsequence();
        System.out.println(minSubsequence.minSubsequence(new int[]{4,4,7,6,7}));
    }
}
