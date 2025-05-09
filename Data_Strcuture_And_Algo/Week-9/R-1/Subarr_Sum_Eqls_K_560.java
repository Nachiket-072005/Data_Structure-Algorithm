import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        int ans = 0;

        // 0 0, k = 0
        m.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans += m.getOrDefault((sum - k), 0);
            m.put(sum, (m.getOrDefault(sum, 0) + 1));
        }

        return ans;
    }
}