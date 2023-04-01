package learn.chapter10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java01_Reflect {
    public static void main(String[] args)throws Exception {
        // TODO 反射
        User user = new User();
        user.test1();
        //user.test2();

        //类对象
        Class<? extends User> aClass = user.getClass();
        //TODO 获取类的名称
        System.out.println(aClass.getName());//获取类的完成名称
        System.out.println(aClass.getSimpleName());//获取类的名称
        System.out.println(aClass.getPackageName());//获取类的包的名称

        //TODO 获取类的父类
        System.out.println(aClass.getSuperclass());
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces.length);
        //获取类的属性
        Field f = aClass.getField("xxxx"); //public
        Field f1 = aClass.getDeclaredField("xxxx"); //所有权限的
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();
        //TODO 获取类的方法
        Method test2 = aClass.getMethod("test2");
        Method xxx = aClass.getDeclaredMethod("xxx");

        //TODO 获取权限
        int modifiers = aClass.getModifiers();

    }
}

class User {
    public void test1(){
        System.out.println("test1...");
    }
}

class Child extends User{
    public void test2(){
        System.out.println("test2...");
    }
}
