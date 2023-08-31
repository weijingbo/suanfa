package More.灵艾山茶府;

public class minSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left =0,sum=0;
        int min = n+1;
        for (int right = 0; right < n; right++) {
            sum+=nums[right];
            while(sum>=target){
                min =Math.min(min,right-left+1);
                sum-=nums[left];
                left++;

            }
        }
        return min<=n?min:0;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(4,new int[]{1,4,4}));
    }
}
