package DesignPatterns.proxy.v03;

import java.util.Random;

public class Tank implements Movable{

    @Override
    public void move() {
        System.out.println("Tank moving cacaaca");
        try {
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
class Tank2  extends Tank{
        @Override
        public void move(){
            long start = System.currentTimeMillis();
            super.move();
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        }
}

    public void main(String[] args) {
        new Tank2().move();
    }
}

interface Movable{
    void move();
}
