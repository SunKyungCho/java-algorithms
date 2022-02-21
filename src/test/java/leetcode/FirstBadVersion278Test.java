package leetcode;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class FirstBadVersion278Test {


    @ParameterizedTest
    @CsvSource(value = {
            "5, 4",
            "3, 2",
            "212675, 170276"
    })
    void test(int version, int firstBadVersion) {

        FirstBadVersion278 solution = new FirstBadVersion278(firstBadVersion);
        int expected = solution.firstBadVersion(version);
        assertThat(expected).isEqualTo(firstBadVersion);

    }

}