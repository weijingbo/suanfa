package LeetCode.TwentyThree.June;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i])};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
