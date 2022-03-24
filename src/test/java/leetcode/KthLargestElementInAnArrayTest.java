package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementInAnArrayTest {


    @Test
    void test1() {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int result = KthLargestElementInAnArray.findKthLargest(nums, 2);
        assertThat(result).isEqualTo(5);

    }

    @Test
    void test2() {

        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int result = KthLargestElementInAnArray.findKthLargest(nums, 4);
        assertThat(result).isEqualTo(4);

    }

}