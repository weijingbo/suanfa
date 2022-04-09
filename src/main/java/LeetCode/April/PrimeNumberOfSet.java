package LeetCode.April;

public class PrimeNumberOfSet {
    /**
     * 给你两个整数left和right ，在闭区间 [left, right]范围内，统计并返回 计算置位位数为质数 的整数个数。
     *
     * 计算置位位数 就是二进制表示中 1 的个数。
     *
     * 例如， 21的二进制表示10101有 3 个计算置位。
     * 
     *
     * 示例 1：
     *
     * 输入：left = 6, right = 10
     * 输出：4
     * 解释：
     * 6 -> 110 (2 个计算置位，2 是质数)
     * 7 -> 111 (3 个计算置位，3 是质数)
     * 9 -> 1001 (2 个计算置位，2 是质数)
     * 10-> 1010 (2 个计算置位，2 是质数)
     * 共计 4 个计算置位为质数的数字。
     * 示例 2：
     *
     * 输入：left = 10, right = 15
     * 输出：5
     * 解释：
     * 10 -> 1010 (2 个计算置位, 2 是质数)
     * 11 -> 1011 (3 个计算置位, 3 是质数)
     * 12 -> 1100 (2 个计算置位, 2 是质数)
     * 13 -> 1101 (3 个计算置位, 3 是质数)
     * 14 -> 1110 (3 个计算置位, 3 是质数)
     * 15 -> 1111 (4 个计算置位, 4 不是质数)
     * 共计 5 个计算置位为质数的数字。
     */
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left;i<right+1;i++){
            int temp = i;
            int count = Integer.bitCount(temp);
            if(count ==2 ||count ==3 ||count==5||count==7||count ==11|| count ==13 ||count ==17||count==19) res++;
        }
        return res;
//        int ans = 0;
//        for (int x = left; x <= right; ++x) {
//            Integer.bitCount()
//            if (((1 << Integer.bitCount(x)) & 665772) != 0) {
//                ++ans;
//            }
//        }
//        return ans;
    }

    public static void main(String[] args) {
        PrimeNumberOfSet primeNumberOfSet = new PrimeNumberOfSet();
        System.out.println(primeNumberOfSet.countPrimeSetBits(977581,983119));
    }
}
