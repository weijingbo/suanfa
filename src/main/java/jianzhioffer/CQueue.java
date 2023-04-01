package jianzhioffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class CQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
      if(outStack.isEmpty()){
          if(inStack.isEmpty()){
              return -1;
          }
          in2out();
      }
      return outStack.pop();
    }

    private void in2out() {
        while(!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }


    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
