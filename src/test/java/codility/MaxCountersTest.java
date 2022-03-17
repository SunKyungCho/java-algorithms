package codility;

import org.assertj.core.internal.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCountersTest {


    @Test
    void test() {
        MaxCounters maxCounters = new MaxCounters();
        int number = 5;
        int[] ints = {3,4,4,6,1,4,4};
        int[] solution = maxCounters.solution(number, ints);
        System.out.println("solution = " + Arrays.toString(solution));
        assertThat(solution).containsExactly(3,2,2,4,2);
    }
}