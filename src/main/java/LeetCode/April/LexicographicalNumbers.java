package LeetCode.April;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    /**
     * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。
     * <p>
     * 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。
     * <p>
     * 示例 1：
     * <p>
     * 输入：n = 13
     * 输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]
     * 示例 2：
     * <p>
     * 输入：n = 2
     * 输出：[1,2]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= n <= 5 * 104
     */
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(); //标记答案
        int cur = 1; //字典从1开始
        for(int i =1;i<=n;i++){  //一共循环n次
            res.add(cur);   //将小数字放进数组
            if(cur*10<=n){
                cur *= 10;  // 将数字放大10倍
            }else{
                if(cur>= n) cur /= 10;  //如果添加的数字超过n，除以10
                cur +=1; //每次循环+1
                while(cur%10 ==0) cur /=10; //进位
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LexicographicalNumbers lexicographicalNumbers = new LexicographicalNumbers();
        System.out.println(lexicographicalNumbers.lexicalOrder(13));
    }
}
