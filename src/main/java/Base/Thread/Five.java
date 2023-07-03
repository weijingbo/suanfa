package Base.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Five implements Runnable{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Five());
    }

    @Override
    public void run() {
        System.out.println("第五种方法");
    }
}
