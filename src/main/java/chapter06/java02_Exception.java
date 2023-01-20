package chapter06;

public class java02_Exception {
    public static void main(String[] args) {
        // TODO 错误

       /*异常处理语法
       捕捉多个异常的时候，需要先捕获范围小的异常，然后再捕获大的异常
        try {
            可能会出现异常的代码
            所有的异常对象都可以被抛出
        }catch (抛出的异常对象){
            异常的解决方案
        }catch (){

        }finally {

        }

        */
        int i= 0;
        int j = 0;
        try {
            j = 10/i;
        }catch (ArithmeticException e){
            e.getMessage();
            e.printStackTrace();
        }finally {
            System.out.println("最终执行的代码");
        }
    }

    public static void test(){
        test();
    }
}

