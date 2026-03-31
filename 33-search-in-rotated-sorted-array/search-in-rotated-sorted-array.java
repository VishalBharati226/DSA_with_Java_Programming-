class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // LEFT HALF SORTED
            if (nums[start] <= nums[mid]) {
                // check karo target left me hai ya nahi
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // RIGHT HALF SORTED
            else {
                // check karo target right me hai ya nahi
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}