package hackerRank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static hackerRank.MakingAnagrams.solution;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MakingAnagramsTest {

    @ParameterizedTest
    @CsvSource({
            "AAAA, 3",
            "BBBBB, 4",
            "ABABABAB, 0",
            "BABABA, 0",
            "AAABBB, 4",
    })
    void solutionTest(String str, int count) {
        assertThat(solution(str)).isEqualTo(count);
    }
}