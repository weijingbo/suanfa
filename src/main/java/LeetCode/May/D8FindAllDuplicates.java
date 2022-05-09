package LeetCode.May;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class D8FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] > 0) {
                nums[x - 1] = -nums[x - 1];
            } else {
                ans.add(x);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        D8FindAllDuplicates d8FindAllDuplicates = new D8FindAllDuplicates();
        System.out.println(d8FindAllDuplicates.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}
