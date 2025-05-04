class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int zeros = 0;
        int i = 0;
        int ans = 0;

        while (i < n) {
            dq.addLast(nums[i]);
            if (nums[i] == 0) {
                zeros++;
            }

            while (!dq.isEmpty() && zeros > k) {
                if (dq.peek() == 0) {
                    zeros--;
                }
                dq.remove();
            }

            ans = Math.max(ans, (int) dq.size());
            i++;
        }

        return ans;
    }
}