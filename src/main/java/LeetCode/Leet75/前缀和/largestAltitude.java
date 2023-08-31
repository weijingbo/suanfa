package LeetCode.Leet75.前缀和;

public class largestAltitude {
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max =0;
        int temp =0 ;
        for(int i =0;i<n;i++){
            temp+=gain[i];
            max = Math.max(temp,max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}
