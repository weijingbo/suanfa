package More.honor;
import java.util.Arrays;

public class Q2 {
    public int Q2(int[][] dp,int k){
        int temp = k;
        Arrays.sort(dp,(o1, o2) -> {return o1[1]-o2[1];});
        for(int i =0;i<dp.length;i++){
            if(dp[i][0]<k && dp[i][2]==0) {
                k +=dp[i][1];
                dp[i][2] = 1;
            }
        }
        if(temp ==k) {
            return k;
        }
        return Q2(dp,k);
    }
    public static void main(String[] args) {
        int[] m = new int[]{4,2,6,4};
        int[] n = new int[]{5,3,8,7};
        int len = m.length;
        int k = 15;
        int[][] dp = new int[m.length][3];
        for (int i = 0; i < m.length; i++) {
            dp[i][0] = m[i];
            dp[i][1] = n[i]-m[i];
            dp[i][2] = 0;
        }
        Q2 q2 = new Q2();
        System.out.println(q2.Q2(dp,k));

    }
}
