package leetcode;

/*
    189. Rotate Array
    Given an array, rotate the array to the right by k steps, where k is non-negative.

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]

    Rotate 계산
    - 어짜피 Array의 길이 만큼 반복이 되기 마련이다.
    - rotate에서 array 길이를 나누면 고놈이 고놈이 된다.
        - 1,2,3,4,5  (0)
        - 3,4,5,1,2, (3) => 3 % 5 = 3
        - 3,4,5,1,2  (8) => 8 % 5 = 3
        - 3,4,5,1,2, (13) => 13 % 5 = 3

    풀이:
    1.
    - array를 하나 copy 한다.
    - 현재 인덱스에서 rotate 만큼 움직였을 때 위치에 값을 넣어준다.

    2. reverse
    - nums = 1,2,3,4,5  rotate = 3
    아래와 같은 동작을 한다.
    - 5,4,3,2,1 => 전체를 뒤집는다.
    - 4,5,3,2,1 rotate 전까지를 바로 잡는다.
    - 나머지를 다시 뒤 집는다.

    3. rotate 한만큼 실제 돌린다;;


* */
public class RotateArray {

    public void rotate(int[] nums, int k) {
//        solution1(nums, k);
        solution2(nums, k);
    }

    private void solution1(int[]nums, int k) {
        int length = nums.length;
        int rotate = k % length;

        int[] old = nums.clone();
        for (int i = 0; i < old.length; i++) {
            int index = (i + rotate) % length;
            nums[index] = old[i];
        }
    }

    private void solution2(int[] nums, int k) {

        int length = nums.length;
        int rotate = k % length;

        reverse(nums, 0, length - 1);
        reverse(nums, 0, rotate - 1);
        reverse(nums, rotate, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
