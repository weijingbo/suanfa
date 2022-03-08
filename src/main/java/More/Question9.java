package More;

public class Question9 {
    /***
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     *
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 例如，121 是回文，而 123 不是。
     *  
     *
     * 示例 1：
     *
     * 输入：x = 121
     * 输出：true
     * 示例 2：
     *
     * 输入：x = -121
     * 输出：false
     * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3：
     *
     * 输入：x = 10
     * 输出：false
     * 解释：从右向左读, 为 01 。因此它不是一个回文数。
     *  
     *
     * 提示：
     *
     * -231 <= x <= 231 - 1
     *
     */
    public boolean isPalindrome(int x) {
//        StringBuilder sb = new StringBuilder();
//        String x1 = String.valueOf(x);
//        if(x<0){
//            return false;
//        }
//        while(x>=10){
//            int temp = x%10;
//            x = x/10;
//            sb.append(temp);
//        }
//        sb.append(x);
//        if(x1.equals(sb.toString())){
//            return true;
//        }else {
//            return false;
//        }
        if(x<0 ||(x % 10 == 0 && x != 0)){
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        Question9 q9 = new Question9();
        if(q9.isPalindrome(121)){
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }
}
