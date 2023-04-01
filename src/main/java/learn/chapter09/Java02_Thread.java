package learn.chapter09;

public class Java02_Thread {
    public static void main(String[] args) throws InterruptedException {
        // TODO 线程 -执行方式（串行、并发)
        //串行执行：多个线程连接成串
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("main线程执行完毕");
    }
}
// TODO 声明自定义线程类
class MyThread1 extends  Thread {
    public void run() {
        System.out.println("MyThread1:"+Thread.currentThread().getName());
    }
}

class MyThread2 extends  Thread {
    public void run() {
        System.out.println("MyThread2:"+Thread.currentThread().getName());
    }
}