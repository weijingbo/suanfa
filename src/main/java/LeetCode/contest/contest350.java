package LeetCode.contest;

import java.util.Arrays;
import java.util.Comparator;

public class contest350 {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while (mainTank >= 5) {
            res += 50;
            mainTank -= 5;
            if (additionalTank > 0) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }
        res += mainTank * 10;
        return res;
    }

    public static int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int min = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            min = Math.min(min, nums[i] - nums[i - 1]);
        }
        return min;
    }

    public static int specialPerm(int[] nums) {
        int mod = (int) 1e9 + 7;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0) {
                    dp[i]++;
                    dp[j]++;
                }
            }
        }
        int res = 0;
        for (int i : dp) {
            res = (res + i) % mod;
        }
        return res;
    }

    public static int paintWalls(int[] cost, int[] time) {
        int res = 0;
        Integer[] temp = new Integer[cost.length];
        for (int i = 0; i < cost.length; i++) {
            temp[i] = i;
        }
        Integer[] costTemp = new Integer[cost.length];
        for (int i = 0; i < costTemp.length; i++) {
            costTemp[i] = i;
        }
        Arrays.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int com = cost[o1]*time[o2]-cost[o2]*time[o1];
                return com == 0 ? (cost[o1]-cost[o2]):com;
            }
        });
        Arrays.sort(costTemp,(a,b)-> b-a);
        int i =0,j=temp.length-1;
        System.out.println(Arrays.toString(temp));
        while(i<=j){
            res+=cost[temp[i]];
            j-=time[temp[i]];
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(distanceTraveled(9,2));

//        System.out.println(findValueOfPartition(new int[]{1,3}));
//        System.out.println(specialPerm(new int[]{2,3,6,1}));

//        System.out.println(paintWalls(new int[]{1, 4, 3, 2}, new int[]{1, 2, 3, 2}));
        System.out.println(paintWalls(new int[]{42,8,28,35,21,13,21,35}, new int[]{2,1,1,1,2,1,1,2}));

    }


}
