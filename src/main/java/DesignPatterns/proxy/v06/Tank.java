package DesignPatterns.proxy.v06;

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

    public static void main(String[] args) {
        new TankTimeProxy(new TankLogProxy(new Tank())).move();
    }

}

class TankTimeProxy  implements Movable{
    Movable m;

    public TankTimeProxy(Movable m){
        this.m = m;
    }
    @Override
    public void move(){
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}


class TankLogProxy implements Movable{
    Movable m;

    public TankLogProxy(Movable m){
        this.m = m;
    }
    @Override
    public void move(){
        System.out.println("start moving...");
        m.move();
        System.out.println("stopped!");
    }
}

interface Movable{
    void move();
}
