package LeetCode.TwentyTwo.September;

import java.util.HashMap;

public class canFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
       int n = arr.length; int m = pieces.length;
       HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(pieces[i][0],i);
        }
        for (int i = 0; i < n;) {
            if(!map.containsKey(arr[i])){
               return false;
            }
            int j = map.get(arr[i]);
            int len = pieces[j].length;
            for (int k = 0; k < len; k++) {
                if(arr[i+k]!= pieces[j][k]){
                    return false;
                }
            }
            i = i+len;
        }
        return true;
    }

    public static void main(String[] args) {
        canFormArray canFormArray = new canFormArray();
        System.out.println(canFormArray.canFormArray(new int[]{91,4,64,78},new int[][]{{78},{4,64},{91}}));
    }
}
