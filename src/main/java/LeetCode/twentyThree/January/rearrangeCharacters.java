package LeetCode.twentyThree.January;

import java.util.HashMap;

public class rearrangeCharacters {
    public static int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> targetmap = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            targetmap.put(target.charAt(i),targetmap.getOrDefault(target.charAt(i),0)+1);
        }
        int res = Integer.MAX_VALUE;
        for (Character c: targetmap.keySet()) {
            res = Math.min(res,map.getOrDefault(c,0)/targetmap.get(c));
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("abc", "abcd"));
    }
}
