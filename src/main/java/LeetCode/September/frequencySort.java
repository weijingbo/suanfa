package LeetCode.September;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class frequencySort {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:nums) {
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int cnt1 = map.get(a);
            int cnt2 = map.get(b);
            return cnt1==cnt2 ? b-a:cnt1-cnt2;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        frequencySort frequencySort = new frequencySort();
        System.out.println(Arrays.toString(frequencySort.frequencySort(new int[]{2, 3, 1, 3, 2})));
    }
}
