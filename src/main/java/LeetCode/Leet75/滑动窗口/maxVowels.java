package LeetCode.Leet75.滑动窗口;

import java.util.HashSet;

public class maxVowels {
    public static int maxVowels(String s, int k) {
        int left =0,right=k;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String substring = s.substring(left, right);
        int res = 0;
        for (int i = 0; i < right; i++) {
            if(set.contains(substring.charAt(i))){
                res++;
            }
        }
        int temp =res;
        left++;
        right++;
        while(right<=s.length()){
            if(set.contains(s.charAt(left-1))){
               temp--;
            }
            if(set.contains(s.charAt(right-1))){
               temp++;
            }
            res = Math.max(res,temp);
            left++;
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
