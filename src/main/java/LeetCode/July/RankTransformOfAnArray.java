package LeetCode.July;


import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortArray = new int[arr.length];
        System.arraycopy(arr,0,sortArray,0,arr.length);
        Arrays.sort(sortArray);
        int[] ans = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int a : sortArray) {
            if (!map.containsKey(a)) {
                map.put(a, map.size() + 1);
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
     }

    public static void main(String[] args) {
        RankTransformOfAnArray rankTransformOfAnArray = new RankTransformOfAnArray();
        System.out.println(Arrays.toString(rankTransformOfAnArray.arrayRankTransform(new int[]{40,10,20,30})));
    }
}
