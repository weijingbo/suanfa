package LeetCode.TwentyTwo.September;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class getKthMagicNumber {
    public static int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int magic = 0;
        for (int i = 0; i < k; i++) {
            long curr = heap.poll();
            magic = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return magic;
    }

    public static void main(String[] args) {
        System.out.println(getKthMagicNumber(3));
    }
}
