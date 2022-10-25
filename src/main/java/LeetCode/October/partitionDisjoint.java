package LeetCode.October;

public class partitionDisjoint {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0], leftPos = 0, curMax = nums[0];
        for (int i = 1; i < n - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }

    public static void main(String[] args) {
        partitionDisjoint partitionDisjoint = new partitionDisjoint();
        System.out.println(partitionDisjoint.partitionDisjoint(new int[]{5,0,3,8,6}));
    }
}
