package LC.easy;

import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int zero = 0;
        int i = 0;
        while(i<nums.length && zero<nums.length) {
            while (i < nums.length && i<zero && nums[i] == 0) {
                i++;
            }
            while (zero < nums.length && nums[zero] != 0) {
                zero++;
            }
            if (i<nums.length && zero<nums.length && zero < i) {
                nums[zero] = nums[i];
                nums[i] = 0;
            }
            zero++;
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{1,0});
    }


}
