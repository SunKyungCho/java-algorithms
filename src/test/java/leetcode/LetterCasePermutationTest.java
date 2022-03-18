package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCasePermutationTest {


    @Test
    void test1() {
        var solution = new LetterCasePermutation();
        List<String> result = solution.letterCasePermutation("a1b2");
        assertThat(result).contains("a1b2", "a1B2", "A1b2", "A1B2");
    }

    @Test
    void test2() {
        var solution = new LetterCasePermutation();
        List<String> result = solution.letterCasePermutation("3z4");
        assertThat(result).contains("3z4", "3Z4");
    }
}