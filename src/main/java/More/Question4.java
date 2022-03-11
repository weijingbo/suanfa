package More;


public class Question4 {
    /***
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     *
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     *
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int s1=0,s2=0;
//        int e1= nums1.length,e2 =nums2.length;
//        while(s1<e1 &&s2<e2){
//            if(nums1[s1]<nums2[s2]){
//                s1++;
//            }else{
//                s2++;
//            }
//            if(nums1[e1]>nums2[e2]){
//                e1--;
//            }else {
//                e2--;
//            }
//        }
//        System.out.println(nums1[s1]);
//        System.out.println(nums1[e1]);
//        System.out.println(nums2[s2]);
//        System.out.println(nums2[e2]);
        return 0;
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        int[] s1 = new int[]{1,2,3};
        int[] s2 = new int[]{4,5,6};
        System.out.println(q4.findMedianSortedArrays(s1,s2));
    }
}
