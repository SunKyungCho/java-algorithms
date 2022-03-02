package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxAreaOfIslandTest {


    @Test
    void test1() {
        MaxAreaOfIsland solution = new MaxAreaOfIsland();
        int[][] grid = {
                new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int result = solution.maxAreaOfIsland(grid);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void test2() {
        MaxAreaOfIsland solution = new MaxAreaOfIsland();
        int[][] grid = {
                new int[]{1,1,0,0,0},
                new int[]{1,1,0,0,0},
                new int[]{0,0,0,1,1},
                new int[]{0,0,0,1,1},
        };
        int result = solution.maxAreaOfIsland(grid);
        assertThat(result).isEqualTo(4);
    }

}