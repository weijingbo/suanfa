package LeetCode.TwentyTwo.September;

import java.util.HashMap;

public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(char1[i], map1.getOrDefault(char1[i],0)+1);
            map2.put(char2[i], map2.getOrDefault(char2[i],0)+1);
        }
        for (Character c: map1.keySet()) {
            if(map1.get(c)!=map2.get(c)){
                return false;
            }
        }
        return true;
    }
}
