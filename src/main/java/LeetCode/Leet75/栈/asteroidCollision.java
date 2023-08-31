package LeetCode.Leet75.栈;

import java.util.ArrayDeque;
import java.util.Arrays;

public class asteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {
            if(asteroids[i]<0){
                int weight = -asteroids[i];
                while(deque.size()>=0 ){
                    Integer last = deque.pollLast();
                    if(last == null){
                        deque.add(asteroids[i]);
                        break;
                    }else if(last<0){
                        deque.add(last);
                        deque.add(asteroids[i]);
                        break;
                    }else if(last>weight){
                        deque.add(last);
                        break;
                    }else if(last==weight){
                        break;
                    }
                }
            }else {
                deque.addLast(asteroids[i]);
            }
        }
        if(deque.isEmpty()){
            return new int[]{};
        }
        int size = deque.size();
        int[] ints = new int[size];

        for (int i = 0; i < size; i++) {
            ints[i] = deque.pollFirst();
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,10,-5})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2,-1,1,2})));
    }
}
