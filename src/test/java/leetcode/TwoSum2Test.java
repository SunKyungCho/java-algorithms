package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSum2Test {


    @Test
    @DisplayName("numbers = [2,7,11,15], target = 9")
    void test1() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] results = twoSum2.twoSum(numbers, target);

        assertThat(results).containsExactly(1, 2);
    }

    @Test
    @DisplayName("numbers = [2,3,4], target = 6")
    void test2() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {2,3,4};
        int target = 6;
        int[] results = twoSum2.twoSum(numbers, target);

        assertThat(results).containsExactly(1, 3);
    }

    @Test
    @DisplayName("numbers = [-1,0], target = -1")
    void test3() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {-1, 0};
        int target = -1;
        int[] results = twoSum2.twoSum(numbers, target);

        assertThat(results).containsExactly(1,2);
    }


    @Test
    @DisplayName("numbers = [5,25,75], target = 100")
    void test4() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {5,25,75};
        int target = 100;
        int[] results = twoSum2.twoSum(numbers, target);

        assertThat(results).containsExactly(2,3);
    }



}