package LeetCode.TwentyTwo.May;

public class D5SubarrayProduct {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, res=0;
        int prod =1,i=0;
        for (int j = 0; j < n; j++) {
            prod *=nums[j];
            while(i<=j && prod >=k){
                prod /=nums[i];
                i++;
            }
            res += j-i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        D5SubarrayProduct d5SubarrayProduct = new D5SubarrayProduct();
        System.out.println(d5SubarrayProduct.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }
}
