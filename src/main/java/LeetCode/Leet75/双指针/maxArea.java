package LeetCode.Leet75.双指针;

public class maxArea {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int res = 0;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left+1);
            int minH = Math.min(height[left],height[right]);
            res = Math.max(res,area);
            while (height[left] <= minH && left < right) {
                left++;
            }
            while (height[right] <= minH && left < right) {
                right--;
            }
        }
        return res;
    }
}
