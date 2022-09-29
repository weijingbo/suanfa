package LeetCode.May;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class D4FindTheWinner {
    /**
     * 输入：n = 5, k = 2
     * 输出：3
     * 解释：游戏运行步骤如下：
     * 1) 从小伙伴 1 开始。
     * 2) 顺时针数 2 名小伙伴，也就是小伙伴 1 和 2 。
     * 3) 小伙伴 2 离开圈子。下一次从小伙伴 3 开始。
     * 4) 顺时针数 2 名小伙伴，也就是小伙伴 3 和 4 。
     * 5) 小伙伴 4 离开圈子。下一次从小伙伴 5 开始。
     * 6) 顺时针数 2 名小伙伴，也就是小伙伴 5 和 1 。
     * 7) 小伙伴 1 离开圈子。下一次从小伙伴 3 开始。
     * 8) 顺时针数 2 名小伙伴，也就是小伙伴 3 和 5 。
     * 9) 小伙伴 5 离开圈子。只剩下小伙伴 3 。所以小伙伴 3 是游戏的获胜者。
     */
    public int findTheWinner(int n, int k) {
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            res[i] = i+1;
//        }
//        int i = 0;
//        int j = 1;
//        int count = 0;
//        while (true) {
//            while(res[(i + n) % n] == 0) i++;
//            if (j == k) {
//                res[(i + n) % n] = 0;
//                j = 0;
//                count++;
//            }
//            if (count == n - 1) break;
//            i++;
//            j++;
//        }
//        Arrays.sort(res);
//        return res[n - 1];
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }


    public static void main(String[] args) {
        D4FindTheWinner d4FindTheWinner = new D4FindTheWinner();
        System.out.println(d4FindTheWinner.findTheWinner(5, 2));
    }
}
