package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
https://leetcode.com/problems/combinations/

77. Combinations
문제
두개의 숫자 n, k 가 주어졌을때
n으로 k개 조합할 수 있는 모든 배열을 리턴하라.

풀이:
n = 4 인경우 [1,2,3,4]를 조합하면 된다.
최대 길이는 20개 이므로 dfs로 풀면 좋을 것 같다.

조합은 순서는 상관이 없다.
dfs값을 호출할때
dfs(1,2,3,4)
dfs(2,3,4)
dfs(3,4)
dfs(4)
이렇게 줗여가면서 호출을 하면 될것 같다.

dfs의 구현
* 리턴 조건 배열의 size가 k개 보다 커지면 탈출한다.
*

* */


class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new ArrayList<>(), 1, n, k);
        return results;
    }

    private void dfs(List<List<Integer>> results, List<Integer> combine, int start, int number, int size) {
        if (combine.size() == size) {
            results.add(new ArrayList<>(combine));
            return;
        }

        for (int i = start; i <= number; i++) {
            combine.add(i);
            System.out.println(combine);
            dfs(results, combine, i + 1, number, size);
            combine.remove(combine.size() - 1);
        }
    }
}
