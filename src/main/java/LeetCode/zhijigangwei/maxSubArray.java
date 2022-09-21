package LeetCode.zhijigangwei;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Math.min(nums[0],0);
        int temp =Math.min(nums[0],0);
        for(int i = 0;i< nums.length; i++){
            temp = Math.max(temp + nums[i], nums[i]);
            max = Math.max(max,temp);
        }
        return max;
    }

    public static void main(String[] args) {
        maxSubArray maxSubArray = new maxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
