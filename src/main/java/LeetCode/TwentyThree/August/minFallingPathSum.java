package LeetCode.TwentyThree.August;

public class minFallingPathSum {
    public static int minFallingPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        System.arraycopy(grid[0], 0, dp[0], 0, col);
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp1=Integer.MAX_VALUE;
                for (int k = 0; k < col; k++) {
                    if(j==k){
                        continue;
                    }

                    temp1 = Math.min(temp1,dp[i-1][k]+grid[i][j]);
                }
                dp[i][j] = temp1;

            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i : dp[row-1]) {
            ans = Math.min(i,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(minFallingPathSum(matrix));
    }
}
