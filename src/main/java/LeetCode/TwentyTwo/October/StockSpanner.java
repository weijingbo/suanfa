package LeetCode.TwentyTwo.October;

import java.util.ArrayList;

public class StockSpanner {
    ArrayList<Integer> list;
    public StockSpanner() {
        list = new ArrayList<>();
    }

    public int next(int price) {
        int res = 1;
        for (int i =list.size()-1 ; i>=0; i--) {
            if(list.get(i)<price){
                res++;
            }else {
                break;
            }
        }
        list.add(price);
        return res;
    }


    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        System.out.println(spanner.next(100));
        System.out.println(spanner.next(80));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(70));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(75));
        System.out.println(spanner.next(85));
    }
}
