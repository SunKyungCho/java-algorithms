package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {



    @Test
    void test() {

        double average = AverageSalaryExcludingTheMinimumAndMaximumSalary.average(new int[]{4000, 3000, 1000, 2000});
        assertThat(average).isEqualTo(2500);

    }

}