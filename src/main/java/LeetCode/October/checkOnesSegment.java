package LeetCode.October;

public class checkOnesSegment {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    public static void main(String[] args) {
        checkOnesSegment checkOnesSegment = new checkOnesSegment();
        System.out.println(checkOnesSegment.checkOnesSegment("110"));
    }
}
