package jianzhioffer;

public class fib {
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        while(n>1){
            int temp = (a+b)%1000000007;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
    }
}
