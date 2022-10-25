package LeetCode.October;

public class kthGrammar {
    public int kthGrammar(int n, int k) {
        if(n==1) return 0;
        int a = kthGrammar(n-1,(k+1)/2);
        int b = a^1;
        if(k%2==1)
            return a;
        else
            return b;
    }
}
