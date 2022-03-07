package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class PermutationsTest {


    @Test
    void test1() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 2, 3};

        List<List<Integer>> results = permutations.permute(nums);

        then(results.size()).isEqualTo(6);
        then(results.get(0)).containsExactly(1, 2, 3);
        then(results.get(1)).containsExactly(1, 3, 2);
        then(results.get(2)).containsExactly(2, 1, 3);
        then(results.get(3)).containsExactly(2, 3, 1);
        then(results.get(4)).containsExactly(3, 1, 2);
        then(results.get(5)).containsExactly(3, 2, 1);

    }


    @Test
    void test2() {
        Permutations permutations = new Permutations();
        int[] nums = {1};

        List<List<Integer>> results = permutations.permute(nums);
        then(results.get(0)).containsExactly(1);
    }
}