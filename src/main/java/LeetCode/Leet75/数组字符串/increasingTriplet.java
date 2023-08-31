package LeetCode.Leet75.数组字符串;

public class increasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int first = nums[0],second = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if(second<num){
                return true;
            }else if(first<num){
                second = num;
            }else {
                first = num;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
}
