package LeetCode.Leet75;

import java.util.ArrayDeque;

public class decodeString {
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                int n = Integer.parseInt(s.substring(i, j));  // 获取重复次数
                i = j + 1;  // 跳过数字后的 '['

                int openBrackets = 1;
                int k = i;
                while (openBrackets > 0) {
                    if (s.charAt(k) == '[') {
                        openBrackets++;
                    } else if (s.charAt(k) == ']') {
                        openBrackets--;
                    }
                    k++;
                }
                String repeatedSubstring = decodeString(s.substring(i, k - 1));  // 递归解码括号内的内容
                for (int x = 0; x < n; x++) {
                    sb.append(repeatedSubstring);
                }
                i = k;  // 跳过括号后的内容
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("13[a]2[bc]"));
    }
}
