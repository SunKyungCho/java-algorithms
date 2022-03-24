package leetcode;


/*
*  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*
* */

/*

문제:
수익을 극대화 하는 최대의

풀이:
ex) 7,1,5,3,6,4
buy: 1
sell: 6

ex) 7,15,1,5,3,6,4
buy: 7
sell: 15


1. 2중포문을 통해서 brute force O(n^2)

2. O(n)

7,1,5,3,6,4
7(buy)
7, 1(buy)
7, 1(buy), 5(sell) -> 4
7, 1(buy), 5(sell), 3
7, 1(buy), 5(sell), 3, 6 -> 5;
7, 1(buy), 5, 3, 6(sell) -> 5;

*/

public class BestTimeToBuyAndSellStock121 {


//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int diff = prices[i] - prices[j];
//                if(diff < 0) {
//                    max = Math.abs(diff) > max ? Math.abs(diff) : max;
//                }
//            }
//        }
//        return max;
//    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buyDate = 0;

        for(int i = 0; i < prices.length; i ++) {
            if(prices[buyDate] > prices[i]) {
                buyDate = i;
            }
            // profit 계산
            profit = Math.max(profit, prices[i] - prices[buyDate]);
        }
        return profit;
    }

}
