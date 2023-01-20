package LeetCode.TwentyTwo.April;

public class D24BinaryGap {
    public int binaryGap(int n) {
//        String bin= Integer.toBinaryString(n);
//        int res =0;
//        int left=0,right=0;
//        for(int i = 0;i<bin.length();i++){
//            if(bin.charAt(i)=='1'){
//                left = right;
//                right = i;
//                res = Math.max(res,right-left);
//
//            }
//        }
//        return res;
        String bin= Integer.toBinaryString(n);
        int res =0;
        int pre=0;
        for(int i = 0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                res = Math.max(res,i-pre);
                pre = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        D24BinaryGap d24BinaryGap = new D24BinaryGap();
        System.out.println(d24BinaryGap.binaryGap(22));
    }
}
