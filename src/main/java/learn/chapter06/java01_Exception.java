package learn.chapter06;

public class java01_Exception {
    public static void main(String[] args) {
        // TODO 错误

        //1、类型转换出现了错误
//        String s = "123";
//        Integer i = (Integer) s;

        //2、递归没有跳出的逻辑：StackOverflowError
//        test();


        //3、 访问一个为空的对象NullPointerException
        //异常分为两大类
        // 3.1可以通过代码恢复正常逻辑执行的异常，称之为运行异常：RuntimeException
        // 3.2不可以通过代码恢复正常逻辑执行的异常，称之为编译异常：Exception
        User user = null;
        System.out.println(user.toString());
    }

    public static void test(){
        test();
    }
}

class User {

}
