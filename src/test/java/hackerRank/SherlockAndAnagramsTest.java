package hackerRank;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static hackerRank.SherlockAndAnagrams.*;
import static org.assertj.core.api.Assertions.assertThat;

class SherlockAndAnagramsTest {

    @Test
    void isEqualStringTest() {
        assertThat(isEqualString("d", "d")).isTrue();
    }

    @Test
    void main() {
        String test = "ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel";
        assertThat(solution(test)).isEqualTo(399);
    }
}