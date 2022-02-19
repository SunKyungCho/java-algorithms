package programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TargetNumberTest {


    @Test
    void testcase1() {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        int expected = TargetNumber.solution(numbers, 3);
        assertThat(expected).isEqualTo(5);
    }

    @Test
    void testcase2() {
        int[] numbers = {4, 1, 2, 1};
        int expected = TargetNumber.solution(numbers, 2);
        assertThat(expected).isEqualTo(2);
    }

}