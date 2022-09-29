package LeetCode.BinarySearch;

public class findKthPositive {
    public static int findKthPositive(int[] arr, int k) {
        int missCount = 0, lastMiss = -1, current = 1, ptr = 0;
        for (missCount = 0; missCount < k; ++current) {
            if (current == arr[ptr]) {
                ptr = (ptr + 1 < arr.length) ? ptr + 1 : ptr;
            } else {
                ++missCount;
                lastMiss = current;
            }
        }
        return lastMiss;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1,2,3,4,7}, 1));
    }
}
