package LeetCode.TwentyTwo.April;

public class CountNumbersWith {
    /**
     * 给你一个整数 n ，统计并返回各位数字都不同的数字 x 的个数，其中 0 <= x < 10n。
     * 
     *
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：91
     * 解释：答案应为除去 11、22、33、44、55、66、77、88、99 外，在 0 ≤ x < 100 范围内的所有数字。
     * 示例 2：
     *
     * 输入：n = 0
     * 输出：1
     * 
     *
     * 提示：
     *
     * 0 <= n <= 8
     */
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int ans =0;
        //排列组合，f（2）=9*9+10，f(3)=9*9*8+10;
        int temp = 9;
        int mul = 9;
        while(n>1){
            mul *=temp;
            ans+=mul;
            temp--;
            n--;
        }
        return ans+10;
    }

    public static void main(String[] args) {
        CountNumbersWith countNumbersWith = new CountNumbersWith();
        System.out.println(countNumbersWith.countNumbersWithUniqueDigits(3));
    }
}
