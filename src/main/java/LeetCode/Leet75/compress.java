package LeetCode.Leet75;

import java.util.ArrayList;
import java.util.HashSet;

public class compress {
    public static int compress(char[] chars) {
       int count = 1;
       char temp=chars[0];
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]==temp){
                count++;
            }else{
                list.add(temp);
                temp = chars[i];
                if(count>1){
                    String cc = String.valueOf(count);
                    for(char c:cc.toCharArray()){
                        list.add(c);
                    }

                }
                count = 1;
            }
            if(i==chars.length-1){
                list.add(temp);
                if(count>1){
                    String cc = String.valueOf(count);
                    for(char c:cc.toCharArray()){
                        list.add(c);
                    }
                }
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        char[] test1 = new char[]{'a','a','b','b','c','c','c','a'};
        char[] test2 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        
        System.out.println(compress(test2));
    }
}
