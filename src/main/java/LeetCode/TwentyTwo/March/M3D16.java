package LeetCode.TwentyTwo.March;

import java.util.HashMap;

public class M3D16 {
    HashMap<String,Integer> map;
    public M3D16() {
        map = new HashMap<String,Integer>();
    }

    public void inc(String key) {
        if(map.containsKey(key)){
            int value = map.get(key)+1;
            map.put(key,value);
        }else{
            map.put(key,1);
        }
    }

    public void dec(String key) {
        if(map.containsKey(key)){
            int value = map.get(key)-1;
            if(value==0){
                map.remove(key);
            }else{
                map.put(key,value);
            }
        }
    }

    public String getMaxKey() {
        String maxs = "";
        int max = 0;
        for (String key: map.keySet()) {
            if(map.get(key)>max){
                max = map.get(key);
                maxs = key;
            }
        }
        return  maxs;

    }

    public String getMinKey() {
        String mins = "";
        int min = Integer.MAX_VALUE;
        for (String key: map.keySet()) {
            if(map.get(key)<min){
                min = map.get(key);
                mins = key;
            }
        }
        return  mins;
    }



    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if(strs.length == 0) return 0;
        char[] str = strs[strs.length-1].toCharArray();
        return str.length;
    }

    public String addBinary(String a, String b) {
        int la = a.length(),lb = b.length();
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        while(la >0 && lb>0){
            int ta = a.charAt(la-1)=='1'? 1:0;
            int tb = b.charAt(lb-1)=='1'? 1:0;
            sb.append((ta+tb+temp)%2);
            temp = (ta+tb+temp)/2;
            la--;
            lb--;
        }
        while(la>0){
            int ta = a.charAt(la-1)=='1'? 1:0;
            sb.append((ta+temp)%2);
            temp = (ta+temp)/2;
            la--;
        }
        while(lb>0){
            int tb = b.charAt(lb-1)=='1'? 1:0;
            sb.append((tb+temp)%2);
            temp = (tb+temp)/2;
            lb--;
        }
        if(temp == 1) sb.append(temp);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        M3D16 m3D16 = new M3D16();
        //System.out.println(m3D16.maxSubArray(new int[]{1}));
        //System.out.println(m3D16.lengthOfLastWord(" "));
        System.out.println(m3D16.addBinary("1010","1011"));
    }
}
