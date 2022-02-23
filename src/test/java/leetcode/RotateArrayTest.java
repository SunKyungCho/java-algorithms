package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {

    @Test
    void test1() {

        RotateArray rotateArray = new RotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);

        assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
    }


    @Test
    void test2() {

        RotateArray rotateArray = new RotateArray();

        int[] nums = {-1, -100, 3, 99};
        rotateArray.rotate(nums, 2);

        assertThat(nums).containsExactly(3, 99, -1, -100);
    }

}