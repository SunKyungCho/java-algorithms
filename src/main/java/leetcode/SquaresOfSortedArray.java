package leetcode;


/*
 * 977. Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 *
 * 풀이:
 * 1 - 10000
 * O(n)
 *
 * - array를 하나 정의 한다.
 * -4,-1,0,3,10
 *  a          b
 *
 *
 * */

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        int start = 0;
        int length = nums.length;
        int end = length - 1;
        int[] results = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                results[i] = nums[start] * nums[start];
                start++;
            } else {
                results[i] = nums[end] * nums[end];
                end--;
            }
        }
        return results;
    }
}
