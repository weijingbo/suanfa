package chapter10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java03_Reflect_Test {
    public static void main(String[] args)throws Exception {
        // TODO 反射 - 练习
        //员工的登陆功能

        //构建方法对象
        Class<Emp> empClass = Emp.class;
//        Class<?> empClass = Class.forName("chapter10.Emp");
        Constructor<Emp> declaredConstructor = empClass.getDeclaredConstructor();
        //构建对象
        Emp emp = declaredConstructor.newInstance();
        //获取对象的属性
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");

        //给属性赋值
        account.set(emp,"zhangsan");
        password.set(emp,"zhangsan");

        //获取登陆方法
        Method login = empClass.getMethod("login");

        //调用方法
        Object result = login.invoke(emp);
        System.out.println(result);


    }
}

class Emp{
    public String account;
    public String password;

    public boolean login(){
        if("admin".equals(account)&& "amdin".equals(password)){
            return true;
        }else {
            return  false;
        }
    }
}

