package More.tuandui;

import java.util.Arrays;

public class Q1 {
    public int getMaximumNumber(int[][] moles) {
        Arrays.sort(moles,(o1,o2)->{return o1[0]-o2[0];});
        int res = 0;
        int[] postion = new int[]{1,1};
        for (int i = 0; i < moles.length; i++) {
            System.out.println(Arrays.toString(moles[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        System.out.println(q1.getMaximumNumber(new int[][]{{2,0,2},{5,2,0},{4,1,0},{1,2,1},{3,0,2}}));
    }
}
