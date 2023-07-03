package Base.Thread;

public class Two implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new Two());
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("第二种方法");
    }
}
