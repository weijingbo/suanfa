package LC.easy;

public class numberOfCuts {
    public static int numberOfCuts(int n) {
        if(n ==1){
            return 0;
        }else if(n%2==0){
            return  n/2;
        }else {
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfCuts(3));
    }
}