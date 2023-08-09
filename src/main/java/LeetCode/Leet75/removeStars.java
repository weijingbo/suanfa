package LeetCode.Leet75;

import java.util.ArrayDeque;

public class removeStars {
    public static String removeStars(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='*'){
                deque.pop();
            }else {
                deque.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            sb.append(deque.pollLast());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
