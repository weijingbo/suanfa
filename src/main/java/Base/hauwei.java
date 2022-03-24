package Base;

import java.util.Arrays;
import java.util.LinkedList;

public class hauwei {

    public static boolean cango(int[] stage,int k){
        int[] res = new int[stage.length];
        for (int i = 0; i < stage.length; i++) {
            res[i] = i + stage[i];
        } //[2,1,4,4,7]
        int max=res[0];
        while(k>0) {
            Arrays.sort(res, max, Math.min(res[max],stage.length));
            max = res[max];
            if (max >= stage.length) return true;
            k--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stage = new int[]{2,0,1,10,0};
        int k = 3;
        System.out.println(cango(stage, k));
    }
}
