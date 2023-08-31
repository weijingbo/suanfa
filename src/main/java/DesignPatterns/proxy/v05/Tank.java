package DesignPatterns.proxy.v05;

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
        new TankTimeProxy(new Tank()).move();
    }

}

class TankTimeProxy  implements Movable{
    Tank tank;

    public TankTimeProxy(Tank tank){
        this.tank = tank;
    }
    @Override
    public void move(){
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}


class TankLogProxy implements Movable{
    Tank tank;

    public TankLogProxy(Tank tank){
        this.tank = tank;
    }
    @Override
    public void move(){
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}

interface Movable{
    void move();
}
