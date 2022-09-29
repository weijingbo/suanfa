package LeetCode.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class checkIfExist {
    public boolean checkIfExist(int[] arr) {
        //0 需要特殊考虑
        HashSet<Integer> set = new HashSet<>();
        boolean isExitZero = false;
        Arrays.sort(arr);
        for (int i :arr) {
            if(set.contains(i*2) || (i%2==0 & set.contains(i/2))){
                return true;
            }else {
                if(i!=0){
                    set.add(i);
                }else {
                    if(isExitZero){
                        return true;
                    }else {
                        isExitZero = true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        checkIfExist checkIfExist = new checkIfExist();
        System.out.println(checkIfExist.checkIfExist(new int[]{0,0}));
    }
}
