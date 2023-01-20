package chapter10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java02_Reflect_ClassLoader {
    public static void main(String[] args)throws Exception {
        // TODO 反射 - 类加载器
        //加载类
        //Java中的类主要分为3种：
        /*
        1、Java核心库中的类：String、Object
        2、JVM 软件平台开发商
        3、自己写的类
        类加载器也有三种
        1、BootClassLoader：启动类加载器(加载时，采用操作系统平台语言实现）
        2、PlatformClassLoader：平台类加载器
        3、AppClassLoader：应用类加载器
         */
        Class<Student> studentClass = Student.class;

        ClassLoader classLoader = studentClass.getClassLoader();
        System.out.println(classLoader);

        Class<String> StringClass = String.class;

        ClassLoader classLoader1 = StringClass.getClassLoader();
        System.out.println(classLoader1);

        //加载Java核心类库>平台类库>自立类


    }
}

class Student{

}

