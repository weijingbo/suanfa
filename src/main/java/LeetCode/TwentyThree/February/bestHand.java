package LeetCode.TwentyThree.February;

import java.util.HashMap;
import java.util.Set;

public class bestHand {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> suitmap = new HashMap<>();
        HashMap<Integer, Integer> rankmap = new HashMap<>();
        for (char suit : suits) {
            suitmap.put(suit, suitmap.getOrDefault(suit, 0) + 1);
        }
        for (int rank : ranks) {
            rankmap.put(rank, rankmap.getOrDefault(rank, 0) + 1);
        }
        int max = 0;
        Set<Integer> keys = rankmap.keySet();
        for (Integer key : keys) {
            if (rankmap.get(key) > max) {
                max = rankmap.get(key);
            }
        }
        if (suitmap.size() == 1) {
            return "Flush";
        } else if (max >=3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }

    public static void main(String[] args) {
        bestHand bestHand = new bestHand();
        System.out.println(bestHand.bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'}));
    }
}
