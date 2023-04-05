package LeetCode.TwentyThree.April;

public class commonFactors {
    public int commonFactors(int a, int b) {
        int res = 0;
        int min = Math.min(a,b);
        for (int i = 1; i <= min; i++) {
            if(a%i==0 && b%i==0){
                res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        commonFactors commonFactors = new commonFactors();
        System.out.println(commonFactors.commonFactors(20,5));
    }
}
