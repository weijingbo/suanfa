package LeetCode.BinarySearch;

public class maxDistance {
    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int L = 0;
        int R = 0;
        while (L < len1 && R < len2) {
            if (nums1[L] > nums2[R]) {
                L++;
            }
            R++;
        }
        return Math.max(R - L - 1, 0);
    }

    public static void main(String[] args) {
        maxDistance maxDistance = new maxDistance();
        System.out.println(maxDistance.maxDistance(new int[]{55,30,5,4,2},new int[]{100,20,10,10,5}));
    }
}
