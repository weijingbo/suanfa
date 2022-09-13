package LeetCode.BinarySearch;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])){
                int[] ans =  new int[]{map.get(numbers[i]),i};
                Arrays.sort(ans);
                return ans;
            }else {
                map.put(target-numbers[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
