package codility;

/*
Lesson 4 Medium
문제:
N이 주어지는데 이걸로 int[N]의 배열을 생성해야 한다.
A배열의 값만큼 생성한 배열을 count해주면 된다.
만약 A배열의 값이 max(N + 1)라면 현재 기준으로 생성한 배열의 제일큰 값들로 모두 세팅해줘야한다.

* 생성한 배열의 maxCount를 가지고 있어야겠다.

풀이:
* int[N]의 배열을 생성한다.
* A를 순회하면서 index에 값을 하나씩 count한다.(++)
* max카운트가 나왔을때
    * 그때마다 바로 모든 값을 더해주면 매번 N만큼 순회해야한다.
    * 그때의 maxCount를 더해서 마지막에 한번만 순회해주면 반복을 줄 일 수있을 것 같다.


* */
class MaxCounters {

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int currentMaxValue = 0;
        int maxCount = 0;

        for(int i = 0; i < A.length; i++) {
            // MAX인 경우

            if(A[i] == N + 1) {
                maxCount = currentMaxValue;
            } else {
                int index = A[i] - 1;
                if(result[index] < maxCount) {
                    result[index] = maxCount + 1;
                } else {
                    result[index]++;
                }
                currentMaxValue = Math.max(currentMaxValue, result[index]);
            }
        }

        for (int i = 0; i < result.length; i++) {
            if(result[i] < maxCount) {
                result[i] = maxCount;
            }
        }
        return result;
    }
}
