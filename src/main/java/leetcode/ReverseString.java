package leetcode;


/*

문자 array 가 주어 졌을때 이 array를 뒤집어라.
단 O(1)로 처리 되어야 한다.

* */

public class ReverseString {

    public void reverseString(char[] s) {

        int iter = s.length / 2;
        int start = 0;
        int end = s.length - 1;

        for (int i = 0; i < iter; i++) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
