package LeetCode.TwentyThree.July;

import java.util.ArrayList;
import java.util.List;

public class reconstructMatrix {
    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        for (int i : colsum) {
            sum+=i;
        }
        if(sum!=upper+lower){
            return new ArrayList<>();
        }
        int n = colsum.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        List<Integer> down = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(colsum[i]==2){
                upper--;
                up.add(1);
                colsum[i]--;
            }else{
                up.add(0);
            }
        }
        int pre = 0;
        while(upper>0 && pre<n){
            if(colsum[pre]==1 && up.get(pre)!=1){
                System.out.println(pre);
                up.set(pre,1);
                colsum[pre]--;
                upper--;
            }
            pre++;
        }
        if(upper>0){
            return new ArrayList<>();
        }
        for (int i : colsum) {
            down.add(i);
        }
        res.add(up);
        res.add(down);
        return res;
    }

    public static void main(String[] args) {
        int[] colsum = new int[]{0,1,2,0,0,0,0,0,2,1,2,1,2};
        System.out.println(reconstructMatrix(9,2,colsum));
    }
}
