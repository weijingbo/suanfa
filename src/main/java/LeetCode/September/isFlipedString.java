package LeetCode.September;

public class isFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        if(s1.equals("")) return true;
        char c = s1.charAt(0);
        String temp = s2;
        while(temp.lastIndexOf(c)!=-1){
            int pos = temp.lastIndexOf(c);
            String retreat = s2.substring(pos)+s2.substring(0,pos);
            if(retreat.equals(s1)){
                return true;
            }
            temp = temp.substring(0,pos);
        }
        return false;
    }

    public static void main(String[] args) {
        isFlipedString isFlipedString = new isFlipedString();
        System.out.println(isFlipedString.isFlipedString("ab", "abb"));
    }
}
