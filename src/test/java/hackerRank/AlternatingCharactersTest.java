package hackerRank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static hackerRank.AlternatingCharacters.solution;
import static org.assertj.core.api.Assertions.assertThat;

class AlternatingCharactersTest {

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
        
        
        int[] a = {1,2,3,4};

        int sum = Arrays.stream(a)
                .sum();
    }
}