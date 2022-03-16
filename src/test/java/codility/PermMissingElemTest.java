package codility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {


    @Test
    void test() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int result = permMissingElem.solution(new int[]{2, 3, 1, 5});
        assertThat(result).isEqualTo(4);

    }

}