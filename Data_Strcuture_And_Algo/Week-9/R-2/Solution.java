public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(0, 1);

        for (int i = 0; i < A.size(); i++) {
            sum = sum ^ A.get(i);
            ans += m.getOrDefault((sum ^ B), 0);
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
