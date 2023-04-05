package LeetCode.TwentyThree.April;

public class maskPII {
//    public String maskPII(String s) {
//        StringBuilder sb = new StringBuilder();
//        if(s.contains("@")){
//            int index = s.indexOf("@");
//            for (int i = 0; i < s.length(); i++) {
//                if(i==0){
//                    sb.append(Character.toLowerCase(s.charAt(i)));
//                    sb.append("*****");
//                } else if (i>=index-1) {
//                    sb.append(Character.toLowerCase(s.charAt(i)));
//                }
//            }
//        }else{
//            int count =0;
//            for (int i = s.length()-1; i>=0; i--) {
//                char c = s.charAt(i);
//                if(Character.isDigit(s.charAt(i)) ){
//                    if(count<=3) {
//                        sb.append(s.charAt(i));
//                    }else if(count==4 ||count ==7 || count ==10){
//                        sb.append("-");
//                        sb.append("*");
//                    }else{
//                        sb.append("*");
//                    }
//                    count++;
//                }
//            }
//            if(count>10){
//                sb.append("+");
//            }
//            sb.reverse();
//        }
//        return sb.toString();
//    }

    public String maskPII(String s) {
        String[] countrys = {"","+*-","+**-","+***-"};
        int at = s.indexOf("@");
       if(at>0){
           s = s.toLowerCase();
           return s.charAt(0)+"*****"+s.substring(at-1);
       }
       s = s.replaceAll("[^0-9]","");
       return countrys[s.length()-10]+"***-***-"+s.substring(s.length()-4);
    }


    public static void main(String[] args) {
        maskPII maskPII = new maskPII();
        System.out.println(maskPII.maskPII("86-(10)12345678"));
    }
}
