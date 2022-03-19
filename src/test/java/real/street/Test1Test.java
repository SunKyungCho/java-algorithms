package real.street;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class Test1Test {

    @Test
    void test1() {
        Test1 test1 = new Test1();
        int result = test1.solution("BAONXXOLL");
        then(result).isEqualTo(1);
    }

    @Test
    void test2() {
        Test1 test1 = new Test1();
        int result = test1.solution("BAOOLLNNOLOLGBAX");
        then(result).isEqualTo(2);

    }

    @Test
    void test5() {
        Test1 test1 = new Test1();
        int result = test1.solution("QAWABAWN");
        then(result).isEqualTo(0);
    }

    @Test
    void test3() {
        Test1 test1 = new Test1();
        int result = test1.solution("QAWABAWONL");
        then(result).isEqualTo(0);
    }

    @Test
    void test4() {
        Test1 test1 = new Test1();
        int result = test1.solution("ONLABLABLOON");
        then(result).isEqualTo(1);
    }
}