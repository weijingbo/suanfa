package LeetCode.BinarySearch;

public class arrangeCoins {
    /**
     * 你总共有n枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。
     *
     * 给你一个数字n ，计算并返回可形成 完整阶梯行 的总行数。
     *
     * 
     *
     * 示例 1：
     *
     *
     * 输入：n = 5
     * 输出：2
     * 解释：因为第三行不完整，所以返回 2 。
     * 示例 2：
     *
     *
     * 输入：n = 8
     * 输出：3
     * 解释：因为第四行不完整，所以返回 3 。
     * 
     *
     * 提示：
     *
     * 1 <= n <= 231 - 1
     * @param n
     * @return
     */
    public static int arrangeCoins(int n) {
        int left=0,right = n;
        long temp;
        while(left<right){
            int mid = left+(right-left)/2;
            temp = ((long) mid *(mid+1))/2;
            if(temp>n) right = mid-1;
            if(temp<n) left = mid+1;
            if(temp ==n) return  mid;
        }
        temp = ((long) left *(left+1))/2;
        if(temp>n) return left-1;
        return  left;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1681692777));
    }
}
