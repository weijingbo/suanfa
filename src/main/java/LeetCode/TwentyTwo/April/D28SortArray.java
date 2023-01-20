package LeetCode.TwentyTwo.April;

import java.util.Arrays;

public class D28SortArray {
    /**
     * 给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
     *
     * 返回满足此条件的 任一数组 作为答案。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [3,1,2,4]
     * 输出：[2,4,3,1]
     * 解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
     * 示例 2：
     *
     * 输入：nums = [0]
     * 输出：[0]
     */
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            while(nums[i]%2==0 &&i<j) i++;
            while(nums[j]%2==1 &&i<j) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        D28SortArray d28SortArray = new D28SortArray();
        System.out.println(Arrays.toString(d28SortArray.sortArrayByParity(new int[]{3,1,2,4})));
    }
}
