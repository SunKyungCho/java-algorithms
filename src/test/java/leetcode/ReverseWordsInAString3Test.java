package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInAString3Test {

    @ParameterizedTest
    @CsvSource(value = {
            "Let's take LeetCode contest, s'teL ekat edoCteeL tsetnoc",
            "God Ding, doG gniD"
    })
    void test1(String actual, String expected) {
        ReverseWordsInAString3 reverseWordsInAString3 = new ReverseWordsInAString3();

        String results = reverseWordsInAString3.reverseWords(actual);
        assertThat(results).isEqualTo(expected);
    }
}