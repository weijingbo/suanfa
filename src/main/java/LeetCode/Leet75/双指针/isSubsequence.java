package LeetCode.Leet75.双指针;

public class isSubsequence {
    public boolean isSubsequence(String s,String t){
        int n = s.length(), m = t.length();
        int i=0,j=0;
       while(i<n&&j<m){
           if(s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
       }
       return n==i;
    }

    public static void main(String[] args) {
        isSubsequence i = new isSubsequence();
        System.out.println(i.isSubsequence("abc","agbch"));
    }
}
