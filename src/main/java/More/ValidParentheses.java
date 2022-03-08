package More;

import java.util.ArrayDeque;
import java.util.Stack;

public class ValidParentheses {

//    public boolean isValid(String s) {
//        Stack<String> stack = new Stack<String>();
//        int length = s.length();
//        String[] list = s.split("");
//        for (int i=0;i<length;i++){
//            System.out.println(list[i]);
//            if(!stack.empty()){
//                if(list[i].equals("}")){
//                    String top = stack.pop();
//                    if(!top.equals("{")){
//
//                        stack.push(top);
//                        stack.push(list[i]);
//                    }
//                }else if(list[i].equals("]")){
//                    String top = stack.pop();
//                    if(!top.equals("[")){
//                        stack.push(top);
//                        stack.push(list[i]);
//                    }
//                }else if(list[i].equals(")")){
//                    String top = stack.pop();
//                    if(!top.equals("(")){
//                        stack.push(top);
//                        stack.push(list[i]);
//                    }
//                }else{
//                    stack.push(list[i]);
//                }
//            }else{
//                stack.push(list[i]);
//            }
//        }
//        return stack.empty() ? true:false;
//    }
public boolean isValid(String s) {
    if (s.length() % 2 == 1) return false;
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if (c == ')' && top != '(') return false;
            if (c == '}' && top != '{') return false;
            if (c == ']' && top != '[') return false;
        }
    }
    return stack.isEmpty();
}

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{[]}"));
    }
}
