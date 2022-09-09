package LeetCode.zhitongche;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p1 = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                ++p1;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if (p0 < p1) {
                    temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                ++p0;
                ++p1;
            }
        }
    }

    public static void main(String[] args) {

        SortColors sortColors = new SortColors();
        int[] nums  = new int[]{1,2,0,1,2,0,1};
        sortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
