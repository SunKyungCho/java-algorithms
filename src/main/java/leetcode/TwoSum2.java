package leetcode;


/*

오름차순으로 정렬된 array가 주어진다.
array 값중에 두개의 수를 더해서 tartget 값을 만들수 있는 것을 찾아야 한다.

그리고 그 index 값을 넘겨야 한다.

풀이:

기준점 pivot은 0부터 증가하고
step은 pivot과 같은 위치에서 시작한다.

pivot + step > tartget 시 기준점 이동
pivot 이동 하고
step pivot 으로 이동


// Step 이동 예시
smaple: 2,3,4,7,11,15

2,3,4,7,11,15
0             << pivot
0             << step

1 step ============
2,3,4,7,11,15
0             << pivot
  0           << step
====================

2 step=============
2,3,4,7,11,15
0             << pivot
  1           << step
====================

2 step=============
2,3,4,7,11,15
0             << pivot
    2         << step

====================


위 풀이는 시간이 너무 오래 걸린다. numbers의 길이가 최대 3 * 10^4 까지 올 수 있으니까

양 끝에 포인트를 삼고 하나씩 줄이면서 비교하면 좋을 것 같다.
target보다 크면 뒤에 포인트를 하나 줄이고
작으면 앞에 포인트를 하나 키우고
이미 정렬이 되어 있기 때문에 가능한 일이다.



* */


public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start != end) {
            if ((numbers[start] + numbers[end]) > target) {
                end--;
            } else if ((numbers[start] + numbers[end]) < target) {
                start++;
            } else {
                break;
            }
        }
        return new int[]{++start, ++end};
    }
}