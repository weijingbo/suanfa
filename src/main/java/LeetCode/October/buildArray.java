package LeetCode.October;

import java.util.ArrayList;
import java.util.List;

public class buildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int tar = 0;
        int length = target.length;
        for (int i = 1; i <= n; i++) {
            if(tar>=length){
                break;
            }
            res.add("push");
            if(target[tar]==i ){
                tar ++;
            }else{
                res.add("pop");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        buildArray buildArray = new buildArray();
        System.out.println(buildArray.buildArray(new int[]{1,3},4));
    }
}
