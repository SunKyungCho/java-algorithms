package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class RottingOrangesTest {

    @Test
    @DisplayName("모두 썩는 경우 테스트")
    void test1() {
        int[][] grid = {
                new int[]{2, 1, 1},
                new int[]{1, 1, 0},
                new int[]{0, 1, 1}
        };

        RottingOranges rottingOranges = new RottingOranges();
        int result = rottingOranges.orangesRotting(grid);
        then(result).isEqualTo(4);
    }

    @Test
    @DisplayName("모두 썩을 수 없는 경우")
    void test2() {
        int[][] grid = {
                new int[]{2, 1, 1},
                new int[]{0, 1, 1},
                new int[]{1, 0, 1}
        };
        RottingOranges rottingOranges = new RottingOranges();
        int result = rottingOranges.orangesRotting(grid);
        then(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("퍼질게 없는 경우")
    void test3() {
        int[][] grid = {
                new int[]{0, 2},
        };
        RottingOranges rottingOranges = new RottingOranges();
        int result = rottingOranges.orangesRotting(grid);
        then(result).isEqualTo(0);
    }
}