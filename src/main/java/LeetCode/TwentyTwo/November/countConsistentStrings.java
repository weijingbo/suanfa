package LeetCode.TwentyTwo.November;

import java.util.HashSet;

public class countConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (char s: allowed.toCharArray()) {
            set.add(s);
        }
        int res = 0;
        for (String word: words) {
            boolean isAllowed = true;
            for (int i = 0; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))){
                    isAllowed = false;
                    break;
                }
            }
            if(isAllowed){
                res++;
            }
        }
        return res;
    }
}
