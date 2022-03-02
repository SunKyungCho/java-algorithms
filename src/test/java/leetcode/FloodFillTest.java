package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloodFillTest {


    @Test
    void test1() {

        FloodFill solution = new FloodFill();

        int[][] image = {
                new int[]{1, 1, 1},
                new int[]{1, 1, 0},
                new int[]{1, 0, 1}
        };
        int[][] results = solution.floodFill(image, 1, 1, 2);

        assertThat(results[0]).containsExactly(2, 2, 2);
        assertThat(results[1]).containsExactly(2, 2, 0);
        assertThat(results[2]).containsExactly(2, 0, 1);
    }


    @Test
    void test2() {

        FloodFill solution = new FloodFill();

        int[][] image = {
                new int[]{0, 0, 0},
                new int[]{0, 0, 0}
        };
        int[][] results = solution.floodFill(image, 0, 0, 2);

        assertThat(results[0]).containsExactly(2, 2, 2);
        assertThat(results[1]).containsExactly(2, 2, 2);
    }

    @Test
    void test3() {

        FloodFill solution = new FloodFill();

        int[][] image = {
                new int[]{0, 0, 0},
                new int[]{0, 1, 1}
        };
        int[][] results = solution.floodFill(image, 1, 1, 1);

        assertThat(results[0]).containsExactly(0, 0, 0);
        assertThat(results[1]).containsExactly(0, 1, 1);
    }

}