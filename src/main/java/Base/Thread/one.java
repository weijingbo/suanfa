package Base.Thread;

public class one extends Thread{
    @Override
    public void run() {
        System.out.println("继承方法");
    }

    public static void main(String[] args) {
        one one = new one();
        one.start();
    }
}
