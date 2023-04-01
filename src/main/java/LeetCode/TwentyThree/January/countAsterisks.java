package LeetCode.TwentyThree.January;

public class countAsterisks {
    public int countAsterisks(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        boolean isFirst = false;
        for(char c:chars){
            if(c=='|'){
                isFirst = !isFirst;
            }
            if(c=='*'&& !isFirst){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        countAsterisks countAsterisks = new countAsterisks();
        System.out.println(countAsterisks.countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks.countAsterisks("iamprogrammer"));
    }
}
