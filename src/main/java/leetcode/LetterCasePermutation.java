package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/letter-case-permutation/
784. Letter Case Permutation

문제:
문자열이 있을때 문자 대문자, 소문자로 만들수 있는 가능한 모든 문자를 리턴하라
순서는 상관 없음.


첫 풀이:
* 대소문자 구분해야함.
* 문자열에서 영문자를 기억한 head를 갖고 dfs를 타고 내려간다.
* head가 문자열의 길이 만큼 돌면 재귀를 멈춘다.



* */

class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> results = new ArrayList<>();
        dfs(results, s.toCharArray(), 0);
        return results;
    }

    private void dfs(List<String> results, char[] str, int head) {

        if (head >= str.length) {
            results.add(String.valueOf(str));
            return;
        }

        if(Character.isDigit(str[head])) {
            dfs(results, str, head + 1);
            return;
        }

        str[head] = Character.toLowerCase(str[head]);
        dfs(results, str, head + 1);
        str[head] = Character.toUpperCase(str[head]);
        dfs(results, str, head + 1);
    }
}
