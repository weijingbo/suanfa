package LeetCode.BinarySearch;

import java.util.Arrays;

public class specialArray {
    public int specialArray(int[] nums) {
        Arrays.sort(nums); //一次排序
        System.out.println(Arrays.toString(nums));
       int ans = 0; // 记录答案
       int n = nums.length;
       int pos = 0; //记录比ans大的位置
       while(ans<=n){
           while(nums[pos]<ans){ //找到比ans大的位置
               if(pos<n-1) pos++;
               else return -1;
           }
           if(ans == n-pos)return ans; //如果比ans大的个数不等于ans，则ans++
           else ans++;
       }
       return -1;
    }

    public static void main(String[] args) {
        specialArray specialArray = new specialArray();
        System.out.println(specialArray.specialArray(new int[]{3,6,7,7,0}));
    }
}
