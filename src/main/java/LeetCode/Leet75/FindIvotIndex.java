package LeetCode.Leet75;

public class FindIvotIndex {

    public int pivotIndex(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
           if(temp*2+nums[i]==sum) return i;
           temp+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIvotIndex findIvotIndex = new FindIvotIndex();
        System.out.println(findIvotIndex.pivotIndex(new int[]{2, 1, -1}));
    }
}
