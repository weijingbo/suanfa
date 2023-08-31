package Base.JVM;

public class Car {
    /**
     * 1、虚拟机自带的加载器
     * 2、启动类（根）加载器
     * 3、扩展类加载器
     * 4、应用程序加载器
     */

    //双亲委派机制:安全
    /**
     * 1、App-->Exc->Boot(最终执行）
     */
    private int age;
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        Class<? extends Car> aClass1 = car1.getClass();
        Class<? extends Car> aClass2 = car2.getClass();
        Class<? extends Car> aClass3 = car3.getClass();

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());


        ClassLoader classLoader = aClass1.getClassLoader();
        System.out.println(classLoader);//AppClassLoader
        System.out.println(classLoader.getParent());//PlatformClassLoader
        System.out.println(classLoader.getParent().getParent());//null
    }
}
