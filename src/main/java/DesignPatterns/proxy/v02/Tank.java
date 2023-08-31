package DesignPatterns.proxy.v02;

import java.util.Random;

public class Tank implements Movable{

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving cacaaca");
        try {
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable{
    void move();
}
