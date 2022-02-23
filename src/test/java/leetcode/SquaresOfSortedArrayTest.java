package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfSortedArrayTest {


    @Test
    void test() {
        SquaresOfSortedArray solution = new SquaresOfSortedArray();

        int[] expected = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        assertThat(expected).containsExactly(0, 1, 9, 16, 100);
    }

    @Test
    void test2() {
        SquaresOfSortedArray solution = new SquaresOfSortedArray();

        int[] expected = solution.sortedSquares(new int[]{-7, -3, 2, 3, 11});
        assertThat(expected).containsExactly(4, 9, 9, 49, 121);
    }
}