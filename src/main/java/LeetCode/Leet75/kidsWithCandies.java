package LeetCode.Leet75;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max,candies[i]);
            candies[i]+=extraCandies;
        }
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        kidsWithCandies kidsWithCandies = new kidsWithCandies();
        System.out.println(kidsWithCandies.kidsWithCandies(new int[]{2,3,5,1,3},3));
    }
}
