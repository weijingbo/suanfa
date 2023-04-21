package LeetCode.TwentyThree.April;

import java.util.HashMap;
import java.util.Map;

public class mostFrequentEven {
    public int mostFrequentEven(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        int res =-1;
        int total = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>total){
                total = entry.getValue();
                res = entry.getKey();
            }else if(entry.getValue()==total){
                res = Math.min(res,entry.getKey());
            }
            System.out.println("res="+res+",total="+total);
        }
        return res;
    }


    public static void main(String[] args) {
        mostFrequentEven mostFrequentEven = new mostFrequentEven();
        System.out.println(mostFrequentEven.mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
    }
}
