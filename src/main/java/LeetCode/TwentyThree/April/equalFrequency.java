package LeetCode.TwentyThree.April;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class equalFrequency {
    public static boolean equalFrequency(String word) {
        if(word.equals("")){
            return false;
        }
        char[] chars = word.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(word.length()%map.size()==1){
            int n = word.length()/map.size();
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            boolean delete = false;
            for (Map.Entry<Character, Integer> entry : entries) {
                if(entry.getValue()!=n){
                    if(delete==false){
                        delete=true;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(equalFrequency(""));
    }
}
