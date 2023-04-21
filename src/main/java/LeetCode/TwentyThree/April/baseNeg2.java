package LeetCode.TwentyThree.April;

public class baseNeg2 {
    public String baseNeg2(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            int remainder = n & 1;
            res.append(remainder);
            n -= remainder;
            n /= -2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        baseNeg2 baseNeg2 = new baseNeg2();
        System.out.println(baseNeg2.baseNeg2(11));
    }
}
