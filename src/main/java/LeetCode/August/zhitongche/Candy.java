package LeetCode.August.zhitongche;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i]>ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }else {
                candies[i] = 1;
            }
        }
        for (int i = ratings.length-2; i >=0; i--) {
            if(ratings[i]>ratings[i+1]){
                candies[i] = Math.max(candies[i+1]+1,candies[i]);
            }
        }
        System.out.println(Arrays.toString(candies));
        return Arrays.stream(candies).sum();
    }

    public static void main(String[] args) {
        Candy candy = new Candy();
        System.out.println(candy.candy(new int[]{1,3,4,5,2}));
    }
}
