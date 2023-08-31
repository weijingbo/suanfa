package LeetCode.Leet75.滑动窗口;

import java.util.ArrayList;
import java.util.List;

public class longestOnes {
    public static int longestOnes(int[] nums, int k) {
        int pre=0,last=0;
        int ans =0;
        int n  =nums.length;
        while(last<n){
            if (nums[last] == 0) {
                k--;
            }
            while(k<0){
                if(nums[pre]==0){
                    k++;
                }
                pre++;
            }
            ans = Math.max(ans,last-pre+1);
            last++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
