class Solution {
    public boolean isPossible(int[] arr, int d, int t) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / (double) d);
        }

        return (sum <= t);
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            end = Math.max(nums[i], end);
        }
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossible(nums, mid, threshold) == true) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}