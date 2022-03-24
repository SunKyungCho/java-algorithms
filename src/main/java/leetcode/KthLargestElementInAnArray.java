package leetcode;


/*

https://leetcode.com/problems/kth-largest-element-in-an-array/
215. Kth Largest Element in an Array

문제:
nums가 주어지고 k번째 큰 숫자를 찾는 문제
3,2,1,5,6,4  k=2
1,2,3,4,5,6
6,5
return 5;

풀이:

PriorityQueue, 정렬 기준을 내림차순
pq poll() 숫자의 count세서 몇번째로 큰지 숫자를 비교하면서
k == count 해당 number를 리턴한다.


max = 0;
number = poll()
if(number > max)
    count++;

if(count == k)
    return number

*/


import java.util.PriorityQueue;

class KthLargestElementInAnArray {

    static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, (a, b) -> b - a);
        for (int num : nums) {
            pq.offer(num);
        }

        int count = 0;
        int maxValue = Integer.MIN_VALUE;
        while(!pq.isEmpty()) {
            int number = pq.poll();
            if(number > maxValue) {
                count++;
            }
            if(count == k) {
                return number;
            }
        }

        return 0;

    }
}
