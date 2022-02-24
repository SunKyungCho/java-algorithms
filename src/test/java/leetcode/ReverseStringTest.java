package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {

    @Test
    void test1() {
        ReverseString reverseString = new ReverseString();
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(chars);

        assertThat(chars).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    void test2() {
        ReverseString reverseString = new ReverseString();
        char[] chars = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(chars);

        assertThat(chars).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
    }


}