package LeetCode.TwentyTwo.March;

public class M3D28 {
    /**
     * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
     * 示例 1：
     *
     * 输入：n = 5
     * 输出：true
     * 解释：5 的二进制表示是：101
     * 示例 2：
     *
     * 输入：n = 7
     * 输出：false
     * 解释：7 的二进制表示是：111.
     * 示例 3：
     *
     * 输入：n = 11
     * 输出：false
     * 解释：11 的二进制表示是：1011.
     */
    public static boolean hasAlternatingBits(int n) {
        if(n<2) return true;
        int temp = n%2;
        n = n/2;
        while(n!=0){
            if((n%2)==temp)return false;
            temp = n%2;
            n = n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}
