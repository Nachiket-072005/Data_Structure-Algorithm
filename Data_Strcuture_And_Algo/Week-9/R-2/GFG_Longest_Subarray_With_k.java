class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (m.containsKey(sum - k)) {
                ans = Math.max(ans, (i - m.get(sum - k)));
            }

            if (!m.containsKey(sum)) {
                m.put(sum, i);
            }
        }

        return ans;
    }
}