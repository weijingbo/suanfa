package BinarySearch;

import java.util.Arrays;

public class FindFirstAndOK {
    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     *
     * 进阶：
     *
     * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     * 示例 2：
     *
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     * 示例 3：
     *
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     */
    public int[] searchRange(int[] nums, int target) {
        if(nums.length ==0) return new int[]{-1,-1};
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(low);
        if(low>=nums.length || nums[low] !=target) return new int[]{-1,-1};
        int[] res = new int[]{low,low};
        for(int i =low;i<nums.length;i++){
            if(i == nums.length-1) res[1] = i;
            if(nums[i] != target){
                res[1] = i-1;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindFirstAndOK findFirstAndOK = new FindFirstAndOK();
        System.out.println(Arrays.toString(findFirstAndOK.searchRange(new int[]{5,7,7,8,8,10}, 10)));
    }
}
