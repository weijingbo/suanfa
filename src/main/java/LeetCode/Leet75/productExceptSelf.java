package LeetCode.Leet75;

import java.util.Arrays;

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if(nums.length==0){
            return new int[]{};
        }
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] res = new int[len];
        left[0] =1;
        right[len-1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = nums[i-1]*left[i-1];
        }
        for(int i =len-1;i>0;i--){
            right[i-1] = nums[i]*right[i];
        }
        for (int i = 0; i < len; i++) {
            res[i] = left[i]*right[i];
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
