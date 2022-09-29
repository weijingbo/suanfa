package Base;

import java.util.HashMap;

public class meituan {


    public int solution(String s1, String s2) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        for (char c : char1) {
            if (hashMap1.containsKey(c)) hashMap1.replace(c, hashMap1.get(c), hashMap1.get(c) + 1);
            else hashMap1.put(c, 1);
        }
        for (char c : char2) {
            if (hashMap2.containsKey(c)) hashMap2.replace(c, hashMap2.get(c), hashMap2.get(c) + 1);
            else hashMap2.put(c, 1);
        }
        int max = Integer.MAX_VALUE;
        for (char c : hashMap2.keySet()) {
            max = Math.min(max, hashMap1.get(c) / hashMap2.get(c));
        }
        return max;
    }


    public int midsum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int middle = n % 2 == 1 ? n / 2 + 1 : n / 2;
        for (int i = 0; i <= middle; i++) {
            sum += nums[i] * (i + 1);
            System.out.println(sum);
        }
        int j = 1;
        for (int i = n - 1; i > middle; i--) {
            sum += nums[i] * j;
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
//        String s1 = "acbccaacccba";
//        String s2 = "acbcca";
        meituan meituan = new meituan();
//        System.out.println(meituan.solution(s1,s2));
        System.out.println(meituan.midsum(new int[]{1, 2, 3, 4}));
    }
}