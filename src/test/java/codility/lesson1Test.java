package codility;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static codility.lesson1.findBiggestGap;
import static codility.lesson1.getBinaryGaps;
import static org.assertj.core.api.Assertions.assertThat;

class lesson1Test {

    @Test
    void binaryTest(int num, String test) {
        assertThat(Integer.toBinaryString(32)).isEqualTo("100000");
    }

    @Test
    void getBinaryGapsTest() {
        List<Integer> binaryGaps = getBinaryGaps("10001001");
        assertThat(binaryGaps).containsExactly(0,4,7);
    }

    @Test
    void findBiggestGapTest() {

        int biggestGap = findBiggestGap(Arrays.asList(0, 4, 7));
        assertThat(biggestGap).isEqualTo(3);

    }

}