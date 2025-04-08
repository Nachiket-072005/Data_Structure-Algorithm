class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = nums[0];
        int[] pre = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            pre[i] = pre[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (pre[i] == sum - pre[i] - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}