package LeetCode.TwentyThree.July;

import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans=0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <n-2 ; i++) {
            int j=i+1,k=n-1;
            while(j<k){
                int s =nums[i]+nums[j]+nums[k];
                if(s==target){
                    return target;
                }
                if(s>target){
                    if(s-target<minDiff){
                        minDiff = s -target;
                        ans = s;
                    }
                    k--;
                }else {
                    if(target-s<minDiff){
                        minDiff = target-s;
                        ans =s;
                    }
                    j++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
