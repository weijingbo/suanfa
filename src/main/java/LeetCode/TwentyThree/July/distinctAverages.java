package LeetCode.TwentyThree.July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class distinctAverages {
    public static int distinctAverages(int[] nums) {
        HashSet<Float> res = new HashSet<>();
        Arrays.sort(nums);
        int left=0;
        int right = nums.length-1;
        while(left<right){
            float averge = (float)(nums[left]+nums[right])/2;
            res.add(averge);
            left++;
            right--;
        }
        return res.size();
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,1,4,0,3,5};
        System.out.println(distinctAverages(a));
    }
}
