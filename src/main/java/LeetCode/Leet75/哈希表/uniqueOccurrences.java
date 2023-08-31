package LeetCode.Leet75.哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(set.contains(entry.getValue())){
                return false;
            }else {
                set.add(entry.getValue());
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
