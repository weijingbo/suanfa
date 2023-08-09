package LeetCode.TwentyThree.August;

public class subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int multi = 1, sum = 0;
        while (n >= 10) {
            int temp = n % 10;
            multi *= temp;
            sum += temp;
            n=n/10;
        }

        multi *= n;
        sum +=n;

        return multi-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }
}
