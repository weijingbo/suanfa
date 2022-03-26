package LeetCode.March;

public class M3D25 {
    /***
     * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
     *
     * 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
     *
     *  
     *
     * 示例 1：
     *
     * 输入：n = 3
     * 输出：0
     * 解释：3! = 6 ，不含尾随 0
     * 示例 2：
     *
     * 输入：n = 5
     * 输出：1
     * 解释：5! = 120 ，有一个尾随 0
     * 示例 3：
     *
     * 输入：n = 0
     * 输出：0
     *  
     *
     * 提示：
     *
     * 0 <= n <= 104
     */

    public static int trailingZeroes(int n) {
        if(n == 0) return 0;
        int a = n/5;
        return trailingZeroes(a)+a;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }

}
