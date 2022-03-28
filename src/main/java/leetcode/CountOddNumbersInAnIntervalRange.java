package leetcode;

/*
1523. Count Odd Numbers in an Interval Range
https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/


문제:
두개의 양수 범위가 주어 졌을때 사이에 범위를 포함한 사이에 들어갈 홀수의 개수를 리턴하다

low = 3, hight = 7
사이에 숫자는 3, 4, 5, 6, 7 그중에 홀수는 3, 5, 7
결과는 3을 리턴하면 된다.

풀이:
1. 반복문
for 문을 범위만큼 돌리면서 홀수를 체크해서 count하면 쉽게 해결 할 수 있을것 같다. O(n)

2. 수학적 계산
((hight + 1) / 2) - (low / 2)

1 ~ 10 까지의 짝수는 몇개?
5개 (2, 4, 6, 8 10) == 10 / 2

* */
class CountOddNumbersInAnIntervalRange {

    public static int countOdds(int low, int high) {
        return ((high + 1) / 2) - (low / 2);
    }
}
