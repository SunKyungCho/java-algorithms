package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class CombinationsTest {


    @Test
    void test1() {

        Combinations combinations = new Combinations();
        List<List<Integer>> results = combinations.combine(4, 2);

        then(results.size()).isEqualTo(6);
        then(results).contains(List.of(2,4));
        then(results).contains(List.of(3,4));
        then(results).contains(List.of(2,3));
        then(results).contains(List.of(1,2));
        then(results).contains(List.of(1,3));
        then(results).contains(List.of(1,2));
    }

    @Test
    void test2() {
        Combinations combinations = new Combinations();
        List<List<Integer>> results = combinations.combine(1, 1);
        then(results).contains(List.of(1));
    }
}