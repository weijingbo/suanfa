package LC.easy;

import java.util.HashMap;

public class romanToInt {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        int preNum = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = map.get(s.charAt(i));
            if(preNum<num){
                sum-=preNum;
            }else {
                sum+=preNum;
            }
            preNum = num;
        }
        sum +=preNum;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
