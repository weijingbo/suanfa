package LeetCode.TwentyThree.May;

public class queryString {
    public static boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String sub = Integer.toString(i, 2);
            if(!s.contains(sub)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(queryString("0110",4));
    }
}
