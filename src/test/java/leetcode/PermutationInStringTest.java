package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.BDDAssertions.then;

class PermutationInStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "ab, eidbaooo, true",
            "ab, eidboaoo, false",
            "abc, abbooo, false",
    })
    void test(String a, String b, boolean expected) {
        PermutationInString solution = new PermutationInString();
        boolean result = solution.checkInclusion(a, b);
        then(result).isEqualTo(expected);
    }
}