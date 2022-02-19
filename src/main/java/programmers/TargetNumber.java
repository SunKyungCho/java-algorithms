package programmers;

class TargetNumber {

    static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private static int dfs(int[] numbers, int target, int index, int sum) {

        // 성공 케이스
        if(numbers.length == index) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int matchingCount = 0;
        matchingCount += dfs(numbers, target, index + 1, sum + numbers[index]);
        matchingCount += dfs(numbers, target, index + 1, sum - numbers[index]);
        return matchingCount;
    }

}
