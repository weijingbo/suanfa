package LeetCode.BinarySearch;

import java.util.Arrays;

public class kWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int col = mat[0].length;
        int[][] eveyLineCount = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int low = 0;
            int high = col;
            while(low<high){
                int mid = low+(high-low)/2;
                if(mat[i][mid]==1){
                   low = mid+1;
                }else{
                    high = mid;
                }
            }
            eveyLineCount[i][0]=i;
            eveyLineCount[i][1]=low;
        }
        Arrays.sort(eveyLineCount,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = eveyLineCount[i][0];
        }
        return ans;
    }

    public static void main(String[] args) {
        kWeakestRows kWeakestRows = new kWeakestRows();
        System.out.println(Arrays.toString(kWeakestRows.kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3)));
    }
}
