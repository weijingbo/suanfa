package LeetCode.TwentyThree.June;

import java.util.PriorityQueue;

public class halveArray {
    public static int halveArray(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        double count = 0;
        int res =0;
        for (int num : nums) {
            queue.add(num);
            count+=num;
        }

        count/=2;
        while(count>0){
            Integer peek = queue.peek();
            System.out.println(peek);
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
