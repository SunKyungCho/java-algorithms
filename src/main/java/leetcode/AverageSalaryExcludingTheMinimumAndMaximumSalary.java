package leetcode;

/*
1491. Average Salary Excluding the Minimum and Maximum Salary
https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

문제:
중복되지 않은 급여정보 배열이 있다.
최대급여와 최소급여를 제외한 평균 급여를 리턴하다.


풀이:
급여를 모두 더하면서 최대 값고 최고 값을 구한다.
평균을 구할때 최소값과 최대값을 빼주고 평균을 구하면 되겠다.

* */

class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public static double average(int[] salary) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;

        for (int data : salary) {
            max = Math.max(max, data);
            min = Math.min(min, data);
            total += data;
        }
        total -= max;
        total -= min;
        return (double) total/ (double)(salary.length - 2);
    }
}
