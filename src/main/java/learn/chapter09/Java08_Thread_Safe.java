package learn.chapter09;

public class Java08_Thread_Safe {
    public static void main(String[] args) {

        // TODO 线程-安全
        User7 user = new User7();

        Thread t1 = new Thread(()->{
            user.name = "张三";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        Thread t2 = new Thread(()->{
            user.name = "李四";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        t1.start();
        t2.start();
        System.out.println("主线程执行完毕");
    }
}

class User7{
    public String name;
}


