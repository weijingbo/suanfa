package LeetCode.TwentyThree.June;

import java.util.Arrays;

public class matrixSum {
    public static int matrixSum(int[][] nums) {
        int ans =0;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        for (int i = 0; i < nums[0].length; i++) {
            int max = nums[0][i];
            for (int j = 1; j < nums.length; j++) {
                max = Math.max(max,nums[j][i]);
            }
            ans+=max;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(matrixSum(new int[][]{{1,2,7},{6,4,2},{6,5,3},{3,2,1}}));
    }
}
