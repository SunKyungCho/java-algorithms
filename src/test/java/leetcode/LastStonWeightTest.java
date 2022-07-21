package leetcode;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class LastStonWeightTest {



    @Test
    void test() {
        int i = LastStonWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        then(i).isEqualTo(1);
    }

    @Test
    void test2() {
        int i = LastStonWeight.lastStoneWeight(new int[]{2, 2});
        then(i).isEqualTo(0);
    }

}