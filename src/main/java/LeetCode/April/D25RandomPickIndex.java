package LeetCode.April;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class D25RandomPickIndex {
    HashMap<Integer,Integer> map;
    Random random;
    ArrayList<ArrayList<Integer>> list;
    public D25RandomPickIndex(int[] nums) {
        map = new HashMap<>();
        list = new ArrayList<>();
        for(int i =0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                list.get(map.get(nums[i])).add(i);
            }else{
                 ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(i);
                 list.add(temp);
                 map.put(nums[i],list.size());
            }
        }
    }

    public int pick(int target) {
        List<Integer> res = list.get(map.get(target));
        int n = res.size();
        random = new Random(n);
        return res.get(random.nextInt());
    }
}
