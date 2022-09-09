package LeetCode.Leet75;

import java.util.Arrays;

public class runningSum {

    public int[] runningSum(int[] nums) {
        int[] res = nums;
        for (int i = 1; i < nums.length; i++) {
            res[i]+=res[i-1];
        }
        return res;
    }


    public static void main(String[] args) {
        runningSum runningSum = new runningSum();
        System.out.println(Arrays.toString(runningSum.runningSum(new int[] {1,2,3,4}) ));
    }
}
