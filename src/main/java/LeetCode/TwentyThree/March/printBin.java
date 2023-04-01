package LeetCode.TwentyThree.March;

public class printBin {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while(sb.length()<=32 && num!=0){
            num *= 2;
            int digest = (int)num;
            sb.append(digest);
            num-=digest;
        }
        return sb.length()<=32?sb.toString():"ERROR";
    }

    public static void main(String[] args) {
        printBin printBin = new printBin();
        System.out.println(printBin.printBin(0.1));
    }
}
