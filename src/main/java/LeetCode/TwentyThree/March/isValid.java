package LeetCode.TwentyThree.March;

import java.util.ArrayDeque;

public class isValid {
    public boolean isValid(String s) {
        ArrayDeque<Character> characters = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==')' && characters.size()!=0){
                if(characters.pop()!='('){
                    return false;
                }
            }else if(c=='}'&& characters.size()!=0){
                if(characters.pop()!='{'){
                    return false;
                }
            }else if(c==']'&& characters.size()!=0){
                if(characters.pop()!='['){
                    return false;
                }
            }else{
                characters.push(c);
            }
        }
        if (characters.size()==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isValid isValid = new isValid();
        System.out.println(isValid.isValid("]"));
    }
}
