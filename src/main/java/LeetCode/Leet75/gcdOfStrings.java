package LeetCode.Leet75;

public class gcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        //假设str1是m个x，str2是n个x，相加之后为（m+n)个x，不等说明无
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        //辗转相除法
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    public int gcd(int a ,int b){
        return b==0?a:gcd(b,a%b);
    }
}
