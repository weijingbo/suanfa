package jianzhioffer;

public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        int row=0,col=n-1;
        while(row<n){
            while(col>0){
               if(matrix[row][col]<target){
                   row++;
               }else if(matrix[row][col]>target){
                   col--;
               }else {
                   return true;
               }
            }
        }
        return false;
    }
}
