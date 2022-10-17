package LeetCode.contest;

import java.util.Arrays;
import java.util.HashSet;

public class contest315 {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<0){
                break;
            }
            if(set.contains(-nums[i])){
                return nums[i];
            }
        }
        return -1;
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
            set.add(reverse(num));
        }
        return  set.size();
    }

    public int reverse(int num){
        int ans = 0;
        while(num>0){
            int temp = num%10;
            ans *=10;
            ans+=temp;
            num /=10;
        }
        return ans;
    }


    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        int ans = 0;
        while(ans<num){
            if(ans+reverse(ans)==num){
                return true;
            }
            ans++;
        }
        return false;
    }


    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minIndex = -1;
        int maxIndex = -1;
        int noneIndex = -1;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == minK) {
                minIndex = i;
            }
            if(nums[i] == maxK) {
                maxIndex = i;
            }
            if(nums[i] > maxK || nums[i] < minK) {
                noneIndex = i;
            }
            if(minIndex != -1 && maxIndex != -1) {
                ans += Math.min(maxIndex, minIndex) - noneIndex > 0 ? Math.min(maxIndex, minIndex) - noneIndex : 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        contest315 contest315 = new contest315();
        System.out.println(contest315.countDistinctIntegers(new int[]{1,13,10,12,31}));
    }

}
