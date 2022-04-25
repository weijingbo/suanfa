package LeetCode.April;

public class D22RotateFunction {
    /**
     * 给定一个长度为 n 的整数数组nums。
     *
     * 假设arrk是数组nums顺时针旋转 k 个位置后的数组，我们定义nums的 旋转函数F为：
     *
     * F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1]
     * 返回F(0), F(1), ..., F(n-1)中的最大值。
     *
     * 生成的测试用例让答案符合32 位 整数。
     *
     * 
     *
     * 示例 1:
     *
     * 输入: nums = [4,3,2,6] =15
     * 输出: 26
     * 解释:
     * F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
     * F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16 = 25+15-4*6
     * F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23 = 16+15-4*2
     * F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26 = 23+15 - 4*3
     * 所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
     *
     *
     */

    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int total =0;
        int max = 0;
        for(int i =0;i<n;i++){
            total +=nums[i];
            max += i*nums[i];
        }
        int temp = max;
        for(int j = n-1;j>0;j--){
            System.out.println(temp);
            temp = temp + total -n*nums[j];
            System.out.println(temp);
            max = Math.max(max,temp);
        }
        return max;
    }

    public static void main(String[] args) {
        D22RotateFunction d22RotateFunction = new D22RotateFunction();
        System.out.println(d22RotateFunction.maxRotateFunction(new int[]{4,3,2,6}));
    }
}
