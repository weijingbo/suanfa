package LeetCode.March;

import java.util.HashMap;
import java.util.Map;

public class M3D5 {
    /***
     * 给你两个字符串 a 和 b，请返回 这两个字符串中 最长的特殊序列  。如果不存在，则返回 -1 。
     *
     * 「最长特殊序列」 定义如下：该序列为 某字符串独有的最长子序列（即不能是其他字符串的子序列） 。
     *
     * 字符串 s 的子序列是在从 s 中删除任意数量的字符后可以获得的字符串。
     *
     * 例如，"abc" 是 "aebdc" 的子序列，因为删除 "aebdc" 中斜体加粗的字符可以得到 "abc" 。 "aebdc" 的子序列还包括 "aebdc" 、 "aeb" 和 "" (空字符串)。
     *  
     *
     * 示例 1：
     *
     * 输入: a = "aba", b = "cdc"
     * 输出: 3
     * 解释: 最长特殊序列可为 "aba" (或 "cdc")，两者均为自身的子序列且不是对方的子序列。
     * 示例 2：
     *
     * 输入：a = "aaa", b = "bbb"
     * 输出：3
     * 解释: 最长特殊序列是 "aaa" 和 "bbb" 。
     * 示例 3：
     *
     * 输入：a = "aaa", b = "aaa"
     * 输出：-1
     * 解释: 字符串 a 的每个子序列也是字符串 b 的每个子序列。同样，字符串 b 的每个子序列也是字符串 a 的子序列。
     *  
     *
     * 提示：
     *
     * 1 <= a.length, b.length <= 100
     * a 和 b 由小写英文字母组成
     */

    public static int findLUSlength(String a, String b) {
        if(a.length()==b.length()){
            return a.equals(b)? -1:a.length();
        }else{
            return Math.max(a.length(), b.length());
        }

    }


//    public static void main(String[] args) {
//        System.out.println(findLUSlength("aaa","aaa"));
//    }
    /***
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     *
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给定一个罗马数字，将其转换成整数。
     *
     */
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        M3D5 m3D5 = new M3D5();
        System.out.println(m3D5.romanToInt("III"));
    }

}

