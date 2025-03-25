
class Solution {
    public int partition(int start, int end, int[] nums) {
        int pivot = nums[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (nums[j] < pivot) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;
        return i; // correct idx of pivot element
    }

    public int quickSelect(int start, int end, int nums[], int kth) {
        // base case
        if (start == end) {
            return nums[start];
        }

        // recursive case
        int idx = partition(start, end, nums);

        if (idx == kth) {
            return nums[idx];
        } else if (idx < kth) {
            // Right Side
            return quickSelect(idx + 1, end, nums, kth);
        } else {
            // left Side
            return quickSelect(start, idx - 1, nums, kth);
        }
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        return quickSelect(0, n - 1, nums, n - k);
    }
}