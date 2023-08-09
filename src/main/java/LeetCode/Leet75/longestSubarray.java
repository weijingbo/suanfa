package LeetCode.Leet75;

public class longestSubarray {
    public static int longestSubarray(int[] nums) {
        int pre=0,last=0;
        int ans =0;
        int n  =nums.length;
        boolean flag = true;
        while(last<n){
            while(!flag && nums[last]==0){
                if(nums[pre]==0){
                    flag = true;
                }
                pre++;
            }
            if (nums[last] == 0) {
                flag=false;
            }
            ans = Math.max(ans,last-pre);
            last++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1= new int[]{1,1,0,1};
        int[] arr2= new int[]{0,1,1,1,0,1,1,0,1};
        int[] arr3= new int[]{1,1,1};
        System.out.println(longestSubarray(arr1));
        System.out.println(longestSubarray(arr2));
        System.out.println(longestSubarray(arr3));
    }
}
