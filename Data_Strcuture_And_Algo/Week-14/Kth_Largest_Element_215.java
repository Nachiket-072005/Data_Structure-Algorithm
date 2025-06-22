class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // Optimal Approach
        int i = 0;
        while (i < k) {
            q.add(nums[i]);
            i++;
        }

        int n = nums.length;
        while (i < n) {
            if (nums[i] > q.peek()) {
                q.poll();
                q.add(nums[i]);
            }

            i++;
        }

        return q.peek();
    }
}