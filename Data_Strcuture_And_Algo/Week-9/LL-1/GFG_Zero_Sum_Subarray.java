import java.util.HashMap;

class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Long, Long> m = new HashMap<>();
        int n = arr.length;
        long sum = 0;
        long ans = 0;
        m.put(0L, 1L);

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans += m.getOrDefault(sum, 0L);
            m.put(sum, m.getOrDefault(sum, 0L) + 1L);
        }

        return (int) ans;
    }
}