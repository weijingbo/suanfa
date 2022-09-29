package More;

import java.util.Arrays;
import java.util.HashSet;

public class testsss {
    static String add(String a, String b) {
        int ta = Integer.parseInt(a,36);
        int tb = Integer.parseInt(b,36);
        return Integer.toString(ta+tb,36);
    }

    static int solve(int[] arr, int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n&&i<=m; i++) {
            if(set.contains(m-arr[i])){
                res++;
                set.remove(m-arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        testsss testsss = new testsss();
        //System.out.println(testsss.add("1a","b"));
        System.out.println(solve(new int[]{0,1,2,3,4,5,6,7,8,9},10,7));
    }

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int[] res = new int[nums.length-1];
        for(int i =1;i<nums.length;i++){
            res[i-1] = nums[i]-nums[i-1];
        }
        Arrays.sort(res);
        return Math.max((res[0] - 2 * k), 0);
    }

}

