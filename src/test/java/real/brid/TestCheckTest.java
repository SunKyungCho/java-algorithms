package real.brid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestCheckTest {

    @Test
    void test() {
        TestCheck testCheck = new TestCheck();
        String result = testCheck.solution("CBACD");
        assertThat(result).isEqualTo("C");
    }

    @Test
    void test1() {
        TestCheck testCheck = new TestCheck();
        String result = testCheck.solution("CABABD");
        assertThat(result).isEqualTo("");
    }

    @Test
    void test2() {
        TestCheck testCheck = new TestCheck();
        String result = testCheck.solution("ACBDACBD");
        assertThat(result).isEqualTo("ACBDACBD");
    }

}