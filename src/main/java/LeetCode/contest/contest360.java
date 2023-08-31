package LeetCode.contest;

import java.util.*;

public class contest360 {
    public static int furthestDistanceFromOrigin(String moves) {
        int dist = 0, count = 0;
        for (char c : moves.toCharArray()) {
            if (c == '_') {
                count++;
            } else {
                dist += c == 'L' ? -1 : 1;
            }
        }
        return Math.max(Math.abs(dist - count), Math.abs(count + dist));

    }

    public static long minimumPossibleSum(int n, int target) {
        long result = 0L;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        HashSet<Integer> set = new HashSet<>();
        int incr = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i]) || set.contains(target - arr[i])) {
                arr[i] = arr[i] + incr;
                while (set.contains(target - arr[i])) {
                    incr++;
                    arr[i]++;
                }
                set.add(arr[i]);
                result += arr[i];
            } else {
                set.add(arr[i]);
                result += arr[i];
            }
        }
        return result;
    }

    public static int minOperations(List<Integer> nums, int target) {
        int[] count = new int[32];
        int result = 0;
        for (Integer num : nums) {
            //统计每一位的和
            for (int i = 0; i <= 30; i++) {
                count[i] += num >> i & 1;
            }
        }

        for (int i = 0; i <= 30; i++) {
            if ((target >> i & 1) > 0) {
                count[i]--;
                for (int j = i; count[j] < 0; j++) {
                    if (j == 31) {
                        return -1;
                    }
                    count[j] += 2;
                    count[j + 1]--;
                    result++;
                }
            }
            count[i + 1] += count[i] / 2;

        }

        return result;
    }




    public long getMaxFunctionValue(List<Integer> receiver, long k) {
        //找出循环
        HashSet<Integer> set = new HashSet<>();
        int[] dp = new int[receiver.size()];
        int count = 0;
        int index = receiver.size() - 1;
        boolean loop = false;
        while (k > 0 && !loop) {
            count += index;
            if (!set.contains(index)) {
                set.add(index);
            } else {
                loop = true;
            }
            index = receiver.get(index);
        }
        if (!loop) return count;
        return 0;
    }

    public static void main(String[] args) {
        //furthestDistanceFromOrigin("L_RL__R");
        //System.out.println(minimumPossibleSum(2,3));
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(32);
//        arr.add(1);
//        arr.add(2);
//        System.out.println(minOperations(arr, 12));
        System.out.println(4>>1 &1);
    }
}
