package LeetCode.TwentyTwo.September;

import java.util.Arrays;

public class decrypt {

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] copy = (int[]) code.clone();
        if(k==0){
            return new int[n];
        }
        if(k>0){
            for (int i = 0; i < n; i++) {
                code[i] = 0;
                for (int j = 1; j <= k; j++) {
                    code[i]+=copy[(i+j)%n];
                }
            }
        }
        if(k<0){
            for (int i = 0; i < n; i++) {
                code[i] = 0;
                for (int j = -1; j >= k; j--) {
                    code[i]+=copy[(i+j+n)%n];
                }
            }
        }
        return code;
    }

    public static void main(String[] args) {
        decrypt decrypt = new decrypt();
        System.out.println(Arrays.toString(decrypt.decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}
