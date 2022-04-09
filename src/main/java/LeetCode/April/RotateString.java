package LeetCode.April;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RotateString {
    /**
     * 给定两个字符串, s和goal。如果在若干次旋转操作之后，s能变成goal，那么返回true。
     *
     * s的 旋转操作 就是将s 最左边的字符移动到最右边。
     *
     * 例如, 若s = 'abcde'，在旋转一次之后结果就是'bcdea'。
     * 
     *
     * 示例 1:
     *
     * 输入: s = "abcde", goal = "cdeab"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "abcde", goal = "abced"
     * 输出: false
     */

    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int gn = goal.length();
        if(n != gn) return false;
        int j =0;
        while(j<n){
            String news = s.substring(j)+s.substring(0,j);
            System.out.println(news);
            if(news.equals(goal)) return true;
            j++;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("bbbacddceeb","ceebbbbacdd"));
    }
}
