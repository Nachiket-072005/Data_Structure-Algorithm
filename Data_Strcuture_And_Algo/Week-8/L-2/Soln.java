import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[(n - k + 1)];

        Deque<Integer> dq = new LinkedList<>();

        // Step - 1
        int i = 0;
        while (i < k) {
            while (dq.size() > 0 && nums[i] < nums[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }

        int index = 0;
        // Step - 2
        while (i < n) {
            ans[index] = nums[dq.getFirst()];
            index++;
            while (dq.size() > 0 && dq.getFirst() <= (i - k)) {
                dq.removeFirst();
            }

            while (dq.size() > 0 && nums[i] < nums[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }
        ans[index] = nums[dq.getFirst()];

        return ans;
    }
}