package real.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test1Test {

    @Test
    void test1() {

        Test1 test1 = new Test1();
        String[] ledgers = {"01/01 4 50000", "01/11 6 3555", "02/01 0 -23555", "02/25 5 5000", "03/25 0 -15000", "06/09 8 43951", "12/30 9 99999"};
        int result = test1.solution(ledgers);
        assertThat(result).isEqualTo(2983);
    }


    @Test
    void test2() {

        Test1 test1 = new Test1();
        String[] ledgers = {"04/01 1 40000", "05/01 5 20000", "08/31 4 10000", "11/11 0 -45000"};
        int result = test1.solution(ledgers);
        assertThat(result).isEqualTo(888);
    }
}