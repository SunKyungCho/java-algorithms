package leetcode;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
