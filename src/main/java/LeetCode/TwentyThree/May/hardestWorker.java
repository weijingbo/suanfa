package LeetCode.TwentyThree.May;

public class hardestWorker {
    public static int hardestWorker(int n, int[][] logs) {
        int start =0;
        int res= 0;
        int max = 0;
        for(int[] log:logs){
            if(log[1]-start>max){
                max = log[1]-start;
                res = log[0];
            }else if(log[1]-start==max){
                res = Math.min(res,log[0]);
            }
            start = log[1];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hardestWorker(10,new int[][]{{0,3},{2,5},{0,9},{1,15}}));
    }
}
