package leetcode;

import org.junit.jupiter.api.Test;

import static leetcode.MinCostClimbingStairs.minCostClimbingStairs;
import static org.assertj.core.api.Assertions.assertThat;

class MinCostClimbingStairsTest {

    @Test
    void minCostClimbingStairsTest() {

        assertThat(minCostClimbingStairs(new int[]{10, 15, 20})).isEqualTo(15);
        assertThat(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);

    }

}