package chapter09;

public class Java04_Thread_Run {
    public static void main(String[] args) throws InterruptedException {
        // TODO 线程 -运行
//        MyThread3 t3 = new MyThread3();
//        t3.start();
//        MyThread4 t4 = new MyThread4();
//
//
//        t4.start();

//        MyThread5 t5 = new MyThread5("t5");
//        MyThread5 t55 = new MyThread5("t55");
//        t5.start();
//        t55.start();
//        Thread t6 = new Thread(()->
//                System.out.println("线程执行1")
//        );
//        t6.start();
//        Thread t7 = new Thread(()->
//                System.out.println("线程执行2")
//        );
//        t7.start();

        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行");
            }
        });
        t8.start();

        System.out.println("main线程执行完毕");

    }
}
// TODO 声明自定义线程类
class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("t3执行");
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("t4执行");
    }
}

class MyThread5 extends Thread{
    private String threadName;
    public MyThread5(String name){
        this.threadName = name;
    }
    @Override
    public void run() {
        System.out.println(this.threadName+"执行");
    }
}