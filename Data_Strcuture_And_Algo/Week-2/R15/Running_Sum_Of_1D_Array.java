class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0;
        int sum = 0;
        int n = nums.length;
        int prefix[] = new int[n];
        int idx = 0;
        while(i < n) {
            sum += nums[i];
            prefix[idx] = sum;
            i++;
            idx++;
        }

        return prefix;
    }
}