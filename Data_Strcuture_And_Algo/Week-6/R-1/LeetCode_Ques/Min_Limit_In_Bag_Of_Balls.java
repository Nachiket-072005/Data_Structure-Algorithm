class Solution {
    public boolean isPossible(int[] arr, int m, int o) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            o -= (arr[i] / m);
            if (arr[i] % m == 0) {
                o++;
            }
        }

        return (o >= 0);
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;

        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            end = Math.max(nums[i], end);
        }
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossible(nums, mid, maxOperations) == true) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}