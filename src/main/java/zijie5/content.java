package zijie5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class content {

    public int findProphet(int n, int[][] trust) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(trust[i][1], map.getOrDefault(trust[i][1],0)+1);
        }
        if (map.size()>2){
            return -1;
        }
        int result = -1;
        for (Integer key: map.keySet()){
            if(map.get(key)>1){
             result = key;
            }
        }
        return result;
    }

    public int solution(int n, String s) {
        int[] temp = new int[n];
        char[] chars = s.toCharArray();
        for (int i = 1; i < n; i++) {
            if (chars[i - 1] == chars[i]) {
                temp[i] = temp[i - 1] + 1;
            } else {
                temp[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (chars[n - 1] == chars[i]) {
                temp[i] = temp[n - 1] + 1;
            } else {
                break;
            }
        }
        int max_F=0;
        int max_M = 0;
        for (int i = 0; i < n; i++) {
            if('F'==chars[i]){
                max_F = Math.max(max_F,temp[i]);
            } else if('M'==chars[i]){
                max_M = Math.max(max_M,temp[i]);
            }
        }
        return Math.abs(n-max_F-max_M)/2;
    }

    public static void main(String[] args) {
        content content = new content();
        System.out.println(content.solution(5, "FFFMFM"));
    }
}
