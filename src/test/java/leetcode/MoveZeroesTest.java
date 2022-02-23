package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {


    @Test
    void test() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void test1() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }

    @Test
    void test2() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {1};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1);
    }

    @Test
    void test3() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {1, 0};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 0);
    }
}