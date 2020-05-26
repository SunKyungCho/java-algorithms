package leetcode.dp;

import leetcode.dp.BestTimeToBuyAndSellStock_121;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStock_121Test {


    @Test
    void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = BestTimeToBuyAndSellStock_121.maxProfit(prices);
        assertThat(profit).isEqualTo(5);
    }
}