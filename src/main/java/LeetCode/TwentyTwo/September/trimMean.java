package LeetCode.TwentyTwo.September;

import java.util.Arrays;

public class trimMean {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double range = (double) (arr.length) *0.05;
        int begin = (int) range;
        int end = arr.length-begin;
        double ans = 0;
        for (int i = begin; i < end; i++) {
            ans+=arr[i];
        }
        return ans/(end-begin);
    }

    public static void main(String[] args) {
        trimMean trimMean = new trimMean();
        System.out.println(trimMean.trimMean(new int[]{6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));
    }
}
