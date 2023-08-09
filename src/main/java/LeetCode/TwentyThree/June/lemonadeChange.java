package LeetCode.TwentyThree.June;

import java.util.HashMap;

public class lemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int bill : bills) {
            if(bill==10){
                map.put(10, map.getOrDefault(10,0)+1);
                int five = map.getOrDefault(5,0);
                if(five==0){
                    return false;
                }
                map.put(5,five-1);
            }else if(bill==20){
                map.put(20, map.getOrDefault(20,0)+1);
                int ten = map.getOrDefault(10,0);
                int five = map.getOrDefault(5,0);
                if(ten>0){
                    map.put(10,ten-1);
                    if(five>0){
                        map.put(5,five-1);
                    }else {
                        return false;
                    }
                }else {
                    if(five>=3){
                        map.put(5,five-3);
                    }else {
                        return false;
                    }
                }
            }else {
                map.put(5, map.getOrDefault(5,0)+1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,20}));
    }
}
