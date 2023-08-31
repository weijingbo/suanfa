package LeetCode.Leet75.哈希表;

import java.util.*;
import java.util.stream.Collectors;

public class closeStrings {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            Character temp1 = word1.charAt(i);
            Character temp2 = word2.charAt(i);
            map1.put(temp1,map1.getOrDefault(temp1,0)+1);
            map2.put(temp2,map2.getOrDefault(temp2,0)+1);
        }
        for (Character character : map1.keySet()) {
            if(!map2.containsKey(character)){
                return false;
            }
        }
        List<Integer> count1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> count2 = map2.values().stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < count2.size(); i++) {
            // 3. 验证字符频次相同
            if (!count1.get(i).equals(count2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
    }
}
