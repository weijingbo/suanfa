package LeetCode.Leet75;

import java.util.HashMap;

public class Isomorphic {

    //大佬的办法
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))) return false;
        }
        return true;
    }

//    public boolean isIsomorphic(String s, String t) {
//        if(s.length()!=t.length()) return false;
//        HashMap<Character,Character> s2t = new HashMap<>();
//        HashMap<Character,Character> t2s = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char x = s.charAt(i);
//            char y = t.charAt(i);
//            if(s2t.containsKey(x) && s2t.get(x)!=y) return false;
//            if(t2s.containsKey(y) && t2s.get(y)!=x) return false;
//            s2t.put(x,y);
//            t2s.put(y,x);
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();
        System.out.println(isomorphic.isIsomorphic("egt","abb"));
    }
}
