package leetcode;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

array를 카피하지 말고 풀어야 한다.
작업 횟수를 최소화 하려면 어떻게 해야 할까???

sample : 0,1,0,3,12

1. 첫번째 그냥 생각은
- 순차적으로 0을 찾는다.
- 0을 찾으면 점점 뒤로 보낸다.
-

* */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(nums.length == 0) {
            return ;
        }

        int cursor = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[++cursor] = nums[i];
            }
            if(cursor != i) {
                nums[i] = 0;
            }
        }
    }
}
