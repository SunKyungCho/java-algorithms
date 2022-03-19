package real.street;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    @Test
    void test2() {

        Test2 test2 = new Test2();
        String hello = test2.solution("hello");
        then(hello).isEqualTo("l");

    }

    @Test
    void test() {

        Test2 test2 = new Test2();
        String hello = test2.solution("helloaa");
        then(hello).isEqualTo("a");

    }

    @Test
    void test1() {

        Test2 test2 = new Test2();
        String hello = test2.solution("cccbaa");
        then(hello).isEqualTo("c");

    }

}