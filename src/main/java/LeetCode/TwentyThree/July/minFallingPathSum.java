package LeetCode.TwentyThree.July;

import java.util.Arrays;

public class minFallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        System.arraycopy(matrix[0], 0, dp[0], 0, col);
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp1=Integer.MAX_VALUE,temp2=Integer.MAX_VALUE;
                if(j-1>=0){
                    temp1 =matrix[i][j]+dp[i-1][j-1];
                }
                if(j+1<col){
                    temp2 = matrix[i][j]+dp[i-1][j+1];
                }
                dp[i][j] = Math.min(dp[i-1][j]+matrix[i][j],Math.min(temp2,temp1));
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
                {2,1,3},{6,5,4},{7,8,9}
        };
        System.out.println(minFallingPathSum(matrix));
    }
}
