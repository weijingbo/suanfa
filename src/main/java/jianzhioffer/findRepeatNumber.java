package jianzhioffer;

import java.util.HashSet;

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
               return num;
            }else {
                set.add(num);
            }
        }
        return nums[0];
    }
}
