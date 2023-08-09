package LeetCode.Leet75;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        int sum =nums[0];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i-1]+nums[i-1];
            sum+=nums[i];
        }
        for (int i = 0; i < n; i++) {
            if(2*dp[i]+nums[i]==sum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 7, 3, 6, 5, 6};
        int[] arr2 = new int[]{1,2,3};
        int[] arr3 = new int[]{2,1,-1};
        System.out.println(pivotIndex(arr1));
    }
}
