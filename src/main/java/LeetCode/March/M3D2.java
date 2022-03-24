package LeetCode.March;

import java.util.ArrayList;
import java.util.List;

public class M3D2 {
    /***
     *给定一个表示整数的字符串 n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。
     *
     * “最近的”定义为两个整数差的绝对值最小。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: n = "123"
     * 输出: "121"
     * 示例 2:
     *
     * 输入: n = "1"
     * 输出: "0"
     * 解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
     *  
     *
     * 提示:
     *
     * 1 <= n.length <= 18
     * n 只由数字组成
     * n 不含前导 0
     * n 代表在 [1, 1018 - 1] 范围内的整数     */
    public static String nearestPalindromic(String n) {
        long selfNumber = Long.parseLong(n);
        long ans = (long) -1;
        List<Long> candidates = getCandidate(n);
        for(long candidate :candidates){
            if (ans == -1 ||
                    Math.abs(candidate - selfNumber) < Math.abs(ans - selfNumber) ||
                    Math.abs(candidate - selfNumber) == Math.abs(ans - selfNumber) && candidate < ans) {
                ans = candidate;
            }
        }
    return Long.toString(ans);
    }

    public static List<Long> getCandidate(String n){
        int len = n.length();
        List<Long> candidates = new ArrayList<Long>() {{
            add((long) Math.pow(10, len - 1) - 1);
            add((long) Math.pow(10, len) + 1);
        }};
        long selfPrefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        for (long i = selfPrefix - 1; i <= selfPrefix + 1; i++) {
            StringBuffer sb = new StringBuffer();
            String prefix = String.valueOf(i);
            sb.append(prefix);
            StringBuffer suffix = new StringBuffer(prefix).reverse();
            sb.append(suffix.substring(len & 1));
            String candidate = sb.toString();
            candidates.add(Long.parseLong(candidate));
        }
        return candidates;
    }

    public static void main(String[] args) {
        System.out.println(nearestPalindromic("1998"));
    }
}
