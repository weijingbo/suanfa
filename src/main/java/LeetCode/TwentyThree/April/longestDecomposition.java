package LeetCode.TwentyThree.April;

public class longestDecomposition {
    public int longestDecomposition(String text) {
        int res=0;
        int n = text.length();
        int l = 0;
        int r = n-1;
        while(l<=r){
            int len = 1;
            while(l+len-1<=r-len+1){
                if(judge(text,l,r-len+1,len)){
                    res+=2;
                    break;
                }
                ++len;
            }

            if (l + len - 1 >= r - len + 1) {
                ++res;
            }
            l += len;
            r -= len;
        }
        return res;
    }

    public boolean judge(String text,int l,int r,int len){
        while(len>0){
            if(text.charAt(l)!=text.charAt(r)){
                return false;
            }
            l++;
            r++;
            len--;
        }
        return true;
    }
}
