package LeetCode.August;

public class MyCircularQueue {
    public int[] myCircular;
    int pre;
    int last;
    int lon;
    boolean isFull = false;
    public MyCircularQueue(int k) {
        myCircular = new int[k];
        pre = 0;
        last = 0;
        lon = k;
    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        myCircular[last] = value;
        last = (last+1)%lon;
        if(last == pre){
            isFull = true;
        }
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        pre = (pre+1)%lon;
        isFull = false;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return myCircular[pre];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return myCircular[(last+lon-1)%lon];
    }

    public boolean isEmpty() {
        if (last == pre && !isFull){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return isFull;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.enQueue(3));
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
    }
}


