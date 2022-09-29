package LeetCode.August.zhitongche;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice) minPrice = prices[i];
            if(ans<prices[i]-minPrice) ans = prices[i]-minPrice;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7,6,4,3,1}));
    }
}
