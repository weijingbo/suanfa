package learn.chapter06;

public class java03_Exception {
    public static void main(String[] args) throws Exception{
        // TODO 错误

       User3 user = new User3();
       int i = 10;
       int j = 0;
       user.test(i,j);
    }
}

class User3 {
    //如果方法中可能会出现问题，那么需要提前声明，告诉其他人，我的方法可能会出现问题
    //此时需要使用关键字throws
    // 如果程序中需要手动抛出异常对象，那么需要使用throw关键字，然后new出异常对象
    public void test(int i, int j)throws Exception{
        try{
            System.out.println(i/j);
        }catch (ArithmeticException e){
            throw  new Exception();
        }
    }
}

