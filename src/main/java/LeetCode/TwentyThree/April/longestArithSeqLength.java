package LeetCode.TwentyThree.April;

import java.util.Arrays;
import java.util.HashSet;

public class longestArithSeqLength {

    public int longestArithSeqLength(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int num:nums) {
            set.add(num);
        }


        int left = 0;
        int res = 0;
        int temp = nums[1]-nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1]!=temp || i== nums.length-1){
               temp = nums[i]-nums[i-1];
               res = Math.max(res,i-left+1);
               left = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        longestArithSeqLength longestArithSeqLength = new longestArithSeqLength();
        System.out.println(longestArithSeqLength.longestArithSeqLength(new int[]{9,4,7,2,10}));
    }
}
