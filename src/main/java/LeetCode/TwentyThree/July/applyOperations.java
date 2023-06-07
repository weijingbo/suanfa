package LeetCode.TwentyThree.July;


import java.util.Arrays;

public class applyOperations {
    public static int[] applyOperations(int[] nums) {
        int left=0;
        int[] res = new int[nums.length];
        int pre = 0;
        while(left< nums.length){
            if(nums[left]!=0 && left< nums.length-1){
                if(nums[left]==nums[left+1]){
                    res[pre] = nums[left]*2;
                    left += 2;
                }else{
                    res[pre] = nums[left];
                    left++;
                }
                pre++;
            }else{
                res[pre] = nums[nums.length-1];
                left++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[]{1, 2, 2, 4, 4, 0})));
    }
}
