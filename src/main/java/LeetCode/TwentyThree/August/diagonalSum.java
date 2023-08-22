package LeetCode.TwentyThree.August;

public class diagonalSum {
    public static int diagonalSum(int[][] mat) {
        int count = 0;
        int col = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            count+=mat[i][i];
        }
        for (int i = mat.length-1; i >=0; i--) {
            count+=mat[col-i][i];
        }
        if(col%2==0){
            count-=mat[col/2][col/2];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
