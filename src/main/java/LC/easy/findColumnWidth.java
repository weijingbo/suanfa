package LC.easy;

import java.util.Arrays;

public class findColumnWidth {
    public static int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                res[j] = Math.max(res[j], String.valueOf(ints[j]).length());
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(findColumnWidth(new int[][]{{-15,1,3}, {15,7,12}, {5,6,-2}})));
    }
}
