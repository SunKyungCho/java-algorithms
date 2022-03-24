package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStock_121Test {


    @Test
    void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = BestTimeToBuyAndSellStock121.maxProfit(prices);
        assertThat(profit).isEqualTo(5);
    }


    @Test
    void maxProfit2() {
        int[] prices = {7, 15, 1, 5, 3, 6, 4};
        int profit = BestTimeToBuyAndSellStock121.maxProfit(prices);
        assertThat(profit).isEqualTo(8);
    }
}