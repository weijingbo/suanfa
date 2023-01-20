package LeetCode.TwentyTwo.September;

import java.util.HashMap;

public class maxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        //将字符串转为字符数组
        char[] chars = s.toCharArray();
        //创建一个hashmap，记录首次出现过的字符串位置
        HashMap<Character,Integer> map = new HashMap<>();
        //记录最大值
        int ans = -1;
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                ans = Math.max(ans,i-map.get(chars[i])-1);
            }else{
                map.put(chars[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters maxLengthBetweenEqualCharacters = new maxLengthBetweenEqualCharacters();
        System.out.println(maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }
}
