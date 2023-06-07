package LeetCode.TwentyThree.July;

import java.util.ArrayList;
import java.util.Arrays;

public class miceAndCheese {
    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int res =0;
        int n = reward1.length;
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            res += reward2[i];
            diff[i] = reward1[i]-reward2[i];
        }
        Arrays.sort(diff);
        for (int i = 0; i < k; i++) {
            res+=diff[n-i-1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(miceAndCheese(new int[]{1,1,3,4},new int[]{4,4,1,1},2));
    }
}
