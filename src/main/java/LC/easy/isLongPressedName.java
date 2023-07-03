package LC.easy;

public class isLongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int prn =0;
        int prt = 0;
        while(prt<typed.length()){
            if(prn<name.length() && name.charAt(prn) == typed.charAt(prt)){
                prn++;
                prt++;
            }else if(prt>0 && typed.charAt(prt)== typed.charAt(prt-1)){
                prt++;
            }else {
                return false;
            }
        }
        return prn == name.length();

    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }
}
