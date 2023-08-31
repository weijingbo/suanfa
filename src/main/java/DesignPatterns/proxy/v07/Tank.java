package DesignPatterns.proxy.v07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
        Tank tank = new Tank();

        //reflection 通过二进制字节码分析类的属性和方法
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHander(tank));

        m.move();
    }

}

class LogHander implements InvocationHandler{
    Tank tank;

    public LogHander(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start...");
        Object o = method.invoke(tank, args);
        System.out.println("method " + method.getName() + " end!");
        return o;
    }
}

interface Movable{
    void move();
}
