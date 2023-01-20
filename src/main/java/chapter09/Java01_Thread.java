package chapter09;

public class Java01_Thread {
    public static void main(String[] args) {
        // TODO 线程
        // Thread是线程类
        // currentThread 方法用于获取当前正在运行的线程
        System.out.println(Thread.currentThread().getName());

        //TODO 创建线程
        MyThread t = new MyThread();
        //TODO 启动线程
        t.start();
    }
}
// TODO 声明自定义线程类
class MyThread extends  Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}