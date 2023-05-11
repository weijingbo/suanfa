package LeetCode.TwentyThree.May;

import java.util.HashSet;

public class smallestRepunitDivByK {
    public static int smallestRepunitDivByK(int k) {
        int resid = 1%k, len =1;
        HashSet<Integer> set = new HashSet<>();
        set.add(resid);
        while(resid!=0){
            resid = ((resid*10)+1)%k;
            len++;
            if(set.contains(resid)){
                return -1;
            }
            set.add(resid);
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(smallestRepunitDivByK(3));
    }
}
