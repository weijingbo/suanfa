package LeetCode.Leet75.动态规划;

import java.util.ArrayDeque;
import java.util.Arrays;

public class tribonacci {
    public static int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int[] nacci = new int[]{0,1,1};
        int count = 3;
        while(count<=n){
            int temp = nacci[0]+nacci[1]+nacci[2];
            nacci[count%3] = temp;
            System.out.println(Arrays.toString(nacci));
            count++;
        }
        return  nacci[(count-1)%3];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }
}
