package LeetCode.TwentyTwo.March;

public class M3D7 {
    public String convertToBase7(int num) {
        /***
         * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
         * 示例 1:
         *
         * 输入: num = 100
         * 输出: "202"
         * 示例 2:
         *
         * 输入: num = -7
         * 输出: "-10"
         * 提示：
         *
         * -107<= num <= 107
         *
         */
        int flag = num>=0? 0:1;
        if(num<0){
            num = -num;
        }
        StringBuffer sb = new StringBuffer();
        while(num>=7) {
            int high = num % 7;
            num = num / 7;
            sb.append(high);
        }
        sb.append(num);
        if(flag==1){
            sb.append("-");
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        M3D7 m3D7 = new M3D7();
        System.out.println(m3D7.convertToBase7(0));
    }
}
