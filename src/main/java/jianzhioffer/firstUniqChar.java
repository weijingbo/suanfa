package jianzhioffer;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class firstUniqChar {
    public char firstUniqChar(String s) {
        if (s.length()==0){
            return ' ';
        }
        HashSet<Character> set = new HashSet<>();
        LinkedList<Character> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(set.contains(c)){
                list.remove(Character.valueOf(c));
            }else {
                set.add(c);
                list.add(c);
            }
        }
        return list.size()==0 ? ' ':list.getFirst();
    }

    public static void main(String[] args) {
        firstUniqChar firstUniqChar = new firstUniqChar();
        System.out.println(firstUniqChar.firstUniqChar("abaccdeff"));
    }
}
