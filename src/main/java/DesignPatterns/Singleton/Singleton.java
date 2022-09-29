package DesignPatterns.Singleton;

public class Singleton {
    /*持续私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载*/
    private static Singleton instance = null;

    private  Singleton(){

    }

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }


    public Object readResovle(){
        return instance;
    }
}
