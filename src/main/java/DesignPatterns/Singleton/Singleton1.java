package DesignPatterns.Singleton;
/*
饿汉模式
类加载到内存后，就实例化一个单例
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){};
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1==instance2);
    }

}
