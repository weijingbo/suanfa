package LeetCode.TwentyThree.February;

import java.util.Arrays;
import java.util.HashMap;

public class decodeMessage {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char beg = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if(Character.isLetter(c)){
                if(!map.containsKey(c)){
                    map.put(c,beg);
                    beg++;
                }
            }
        }
        char[] chars = message.toCharArray();
        for (int i = 0; i < message.length(); i++) {
            char m = message.charAt(i);
            if(Character.isLetter(m)){
                chars[i] = map.get(m);
            }
        }
        return String.valueOf(chars);
    }
}
