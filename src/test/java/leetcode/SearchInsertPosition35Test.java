package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInsertPosition35Test {


    @Test
    void test() {
        SearchInsertPosition35 solution = new SearchInsertPosition35();

        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test1() {
        SearchInsertPosition35 solution = new SearchInsertPosition35();

        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test2() {
        SearchInsertPosition35 solution = new SearchInsertPosition35();

        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(4);
    }
}