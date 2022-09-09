package LeetCode.BinarySearch;

import java.util.Arrays;

public class searchRange {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int[] ans = new int[2];
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        if(nums[low] !=target){
            return new int[]{-1,-1};
        }
        ans[0] = low;
        low = 0;
        high = nums.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        ans[1] = low-1;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
