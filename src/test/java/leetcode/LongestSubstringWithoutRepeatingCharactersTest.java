package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.BDDAssertions.then;

class LongestSubstringWithoutRepeatingCharactersTest {


    @ParameterizedTest
    @CsvSource(value = {
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            "a, 1",
            "au, 2",
            "abba, 2",
            "tmmzuxt, 5"
    })
    void test1(String str, int expected) {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(str);
        then(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        var solution = new LongestSubstringWithoutRepeatingCharacters();
        int result = solution.lengthOfLongestSubstring(" ");
        then(result).isEqualTo(1);
    }



}