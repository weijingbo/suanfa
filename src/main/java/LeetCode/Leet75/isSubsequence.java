package LeetCode.Leet75;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int prs =0, prt=0;
        int ls =s.length(),lt = t.length();
        while (prt<lt && prs<ls){
            if(s.charAt(prs)==t.charAt(prt)){
                prs++;
            }
            prt++;
        }
        return prs == ls;
    }
}
