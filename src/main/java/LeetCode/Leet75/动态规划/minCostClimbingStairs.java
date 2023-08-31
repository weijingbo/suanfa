package LeetCode.Leet75.动态规划;

public class minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] temp = new int[n];
        //初始化
        temp[0] = cost[0];
        temp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            temp[i] = Math.min(temp[i - 2], temp[i - 1]) + cost[i];
        }
        return Math.min(temp[n - 2], temp[n - 1]);
    }
}
