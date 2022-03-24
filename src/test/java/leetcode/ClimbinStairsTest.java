package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbinStairsTest {


    @Test
    void test() {

        assertThat(ClimbinStairs.climbStairs(2)).isEqualTo(2);
        assertThat(ClimbinStairs.climbStairs(3)).isEqualTo(3);

    }


}