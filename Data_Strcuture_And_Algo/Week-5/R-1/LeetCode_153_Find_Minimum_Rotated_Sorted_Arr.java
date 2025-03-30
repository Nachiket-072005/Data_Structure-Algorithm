class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            // Middle Element is minimum or not
            if (nums[(mid - 1 + n) % n] > nums[mid] && nums[mid] < nums[(mid + 1) % n]) {
                return nums[mid];
            } else if (nums[st] <= nums[mid] && nums[mid] <= nums[end]) // If array is sorted
            {
                return nums[st];
            } else if (nums[st] <= nums[mid]) // Left Sorted
            {
                // Move to right side
                st = mid + 1;
            } else // Right Sorted
            {
                // Move to left side
                end = mid - 1;
            }
        }

        return 0;
    }
}
