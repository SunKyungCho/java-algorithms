package leetcode.dp;


/*
*  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*
* */
public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[i] - prices[j];
                if(diff < 0) {
                    max = Math.abs(diff) > max ? Math.abs(diff) : max;
                }
            }
        }
        return max;
    }
}
