class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = (int) 1e9;

        while (j < n) {
            sum += nums[j];

            while (i <= j && sum >= target) {
                ans = Math.min(ans, (j - i + 1));
                sum -= nums[i];
                i++;
            }
            j++;
        }

        if (ans == (int) 1e9) {
            ans = 0;
        }

        return ans;
    }
}