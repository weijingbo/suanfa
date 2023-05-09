package LeetCode.TwentyThree.May;

public class numPairsDivisibleBy60 {
    public static int numPairsDivisibleBy60(int[] time) {
        int[] record = new int[60];
        int count =0;
        for (int t:time) {
            t %=60;
            if(t!=0){
                count+=record[60-t];

            }else{
                count+=record[t];
            }
            record[t]++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] time1 = new int[]{60,60,60};
        System.out.println(numPairsDivisibleBy60(time1));
    }
}
