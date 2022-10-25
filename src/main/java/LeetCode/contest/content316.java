package LeetCode.contest;

import java.text.ParseException;

public class content316 {
    public boolean haveConflict(String[] event1, String[] event2) {
        if (event1[1].compareTo(event2[0])<0  || event2[1].compareTo(event1[0])<0){
            return false;
        }
        return true;
    }


    public int subarrayGCD(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length-1){
            right++;
            if(nums[right]%k!=0){
                res =res+right-left;
                left=right;
            }

        }
        return res;
    }


    public static void main(String[] args) {
        content316 content316 = new content316();
       //System.out.println(content316.haveConflict(new String[]{"10:00","11:00"},new String[]{"14:00","15:00"}));
        System.out.println(content316.subarrayGCD(new int[]{9,3,1,2,6,3},3));
    }
}
