package LeetCode.TwentyThree.July;

public class maximumSum {
    public int maximumSum(int[] arr) {
        int dp0 = arr[0],dp1=0,res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp0 = Math.max(dp0+arr[i],arr[i]);
            dp1 = Math.max(dp0,0)+arr[i];
            res = Math.max(res,Math.max(dp0,dp1));
        }
        return res;
    }
}
