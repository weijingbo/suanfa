package LeetCode.TwentyTwo.March;

public class M3D15 {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, cnt = 0;
        for (int i = 0; i < 1 << nums.length; i++) {
            int orVal = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    orVal |= nums[j];
                }
            }
            if (orVal > maxOr) {
                maxOr = orVal;
                cnt = 1;
            } else if (orVal == maxOr) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        M3D15 m3D15 = new M3D15();
        System.out.println(m3D15.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}
