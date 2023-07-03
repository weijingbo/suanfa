package LC.easy;

import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length-1;
        boolean flag = true;
        while(flag && n>=0){
            digits[n]+=1;
            if(digits[n]/10==1){
                digits[n] = 0;
            }else {
                flag =false;
            }
            n--;
        }
        if(n==-1 && flag){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for (int i = 1; i < digits.length+1; i++) {
                res[i]= digits[i-1];
            }
            digits = res;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }
}
