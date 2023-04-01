package jianzhioffer;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinStack {
    ArrayDeque<Integer> minQueue;
    ArrayDeque<Integer> queue;
    /** initialize your data structure here. */
    public MinStack() {
        queue = new ArrayDeque<>();
        minQueue = new ArrayDeque<>();
        minQueue.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        queue.push(x);
        minQueue.push(Math.min(x,minQueue.peek()));
    }

    public void pop() {
        queue.pop();
        minQueue.pop();
    }

    public int top() {
        return queue.peek();
    }

    public int min() {
        return minQueue.peek();
    }
}
