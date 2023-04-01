package LeetCode.TwentyThree.February;

public class movesToMakeZigzag {

    public int movesToMakeZigzag(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            ans[i & 1] += Math.max(nums[i] - Math.min(i > 0 ? nums[i - 1] : 1001, i < n - 1 ? nums[i + 1] : 1001) + 1, 0);
        }
        return Math.min(ans[0], ans[1]);
    }
}
