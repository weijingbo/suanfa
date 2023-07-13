package LeetCode.TwentyThree.July;

public class alternateDigitSum {
    public static int alternateDigitSum(int n) {
        int ans = 0;
        boolean flag = true;
        while(n>=10){
            if(flag){
                ans+= n%10 ;
                flag = false;
            }else {
                ans-= n%10;
                flag = true;
            }
            n=n/10;
        }
        if(flag){
            ans = n+ ans;
        }else {
            ans = n-ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(5211));
        System.out.println(alternateDigitSum(10));
    }
}
