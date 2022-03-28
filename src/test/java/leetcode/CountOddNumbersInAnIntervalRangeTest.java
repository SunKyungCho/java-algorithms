package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountOddNumbersInAnIntervalRangeTest {

    @Test
    void test() {
        int result = CountOddNumbersInAnIntervalRange.countOdds(3, 7);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test1() {
        int result = CountOddNumbersInAnIntervalRange.countOdds(8, 10);
        assertThat(result).isEqualTo(1);
    }

}