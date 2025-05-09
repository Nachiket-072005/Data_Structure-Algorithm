import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;

            if (sum < 0) {
                sum += k;
            }

            ans += m.getOrDefault((sum % k), 0);
            m.put(sum, (m.getOrDefault((sum % k), 0) + 1));
        }

        return ans;
    }
}