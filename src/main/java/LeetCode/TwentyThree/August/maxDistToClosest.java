package LeetCode.TwentyThree.August;

public class maxDistToClosest {
    public static int maxDistToClosest(int[] seats) {
        int max = 0;
        int index =0;
        int pre = 0;
        int n = seats.length;
        //中间的情况
        while(index<n){
            if(seats[index]==1){
                max = Math.max(max,index-pre-1);
                pre = index;
            }
            index++;
        }
        max = (max+1)/2;
        //考虑在开头
        int temp = 0;
        if(seats[0]!=1){
            while(seats[temp]==0){
                temp++;
            }
            max = Math.max(max,temp);
        }
        if(seats[index-1]!=1){
            max = Math.max(max,index-pre-1);
        }
        return max;
    }

    public static void main(String[] args) {
       // System.out.println(maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
        System.out.println(maxDistToClosest(new int[]{1,0,0,0}));
        System.out.println(maxDistToClosest(new int[]{0,1}));
    }
}
