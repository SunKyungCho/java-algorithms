package hackerRank;

import org.junit.jupiter.api.Test;

import static hackerRank.MakingAnagrams.solution;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MakingAnagramsTest {

    @Test
    void solutionTest() {
        assertThat(solution("cde", "abc")).isEqualTo(4);
    }
}