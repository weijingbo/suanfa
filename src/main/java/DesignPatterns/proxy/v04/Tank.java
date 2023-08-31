package DesignPatterns.proxy.v04;

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

interface Movable{
    void move();
}
