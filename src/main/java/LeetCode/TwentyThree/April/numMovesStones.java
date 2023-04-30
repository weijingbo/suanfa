package LeetCode.TwentyThree.April;

import java.util.Arrays;

public class numMovesStones {
    public  static int[] numMovesStones(int a, int b, int c) {
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
        int[] res = new int[2];
        if(arr[1]-arr[0]==1&& arr[2]-arr[1]==1){
            res[0] = 0;
        }else if(arr[1] - arr[0] == 1 || arr[2] - arr[1] == 1 || arr[2] - arr[1] == 2 || arr[1] - arr[0] == 2){
            res[0] = 1;
        }else{
            res[0] = 2;
        }
        res[1] = arr[2]-arr[0]-2;
        return res;
    }
}
