package Base.Thread;

public class Three {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类实现");
//            }
//        });
        Thread thread = new Thread(() -> {
            System.out.println("匿名内部类实现");
        });
        thread.start();
    }
}
