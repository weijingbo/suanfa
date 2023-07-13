package LeetCode.contest;

import java.util.ArrayList;
import java.util.List;

public class contest353 {

    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static int maximumJumps(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(nums[j] - nums[i]) <= target){
                    list.add(j);
                }
            }
            graph.add(list);
        }
        System.out.println(graph);
        return DFS(0,n-1,graph);

    }

    public static int DFS(int start, int target, List<List<Integer>> graph){
        int ans =0;
        for(int i: graph.get(start)){
           if(i==target){
               return 1;
           }
           ans = Math.max(ans,DFS(i,target,graph));
        }
        return ans+1;
    }


    public static int maxNonDecreasingLength(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums1.length];
        nums3[0] = Math.min(nums1[0],nums2[0]);
        int ans =1;
        int temp=ans;
        for (int i = 1; i < nums1.length; i++) {
            if(nums1[i]>=nums3[i-1] && nums2[i]>=nums3[i-1]){
                nums3[i] = Math.min(nums1[i],nums2[i]);
                temp++;
            }else if(nums1[i]>=nums3[i-1] && nums2[i]<nums3[i-1]){
                nums3[i] = nums1[i];
                temp++;
            }else if(nums1[i]<nums3[i-1] && nums2[i]>=nums3[i-1]){
                nums3[i] = nums2[i];
                temp++;
            }else{
                nums3[i] = Math.min(nums1[i],nums2[i]);
                ans = Math.max(temp,ans);
                temp = 1;
            }
        }
        return Math.max(temp,ans);
    }

    public static void main(String[] args) {
//        System.out.println(theMaximumAchievableX(3, 2));
//        System.out.println(maximumJumps(new int[]{1, 0, 2}, 1));
//        System.out.println(maximumJumps(new int[]{1, 3, 6, 4, 1, 2}, 3));
//        System.out.println(maximumJumps(new int[]{1, 3, 6, 4, 1, 2}, 0));
        System.out.println(maxNonDecreasingLength(new int[]{2,3,1},new int[]{1,2,1}));
        System.out.println(maxNonDecreasingLength(new int[]{1,3,2,1},new int[]{2,2,3,4}));
    }


}
