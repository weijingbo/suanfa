package LeetCode.Leet75.滑动窗口;

public class findMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        int left =0,right=k-1;
        int sum =0;
        for (int i = left; i <= right; i++) {
            sum+=nums[i];
        }
        left++;
        right++;
        double res= (double) sum/k;
        while(right< nums.length){
            sum = sum-nums[left-1]+nums[right];
            double temp = (double) sum/k;
            res = Math.max(res,temp);
            left++;
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
}
