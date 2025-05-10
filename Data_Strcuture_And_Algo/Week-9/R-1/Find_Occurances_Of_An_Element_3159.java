class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        int M = queries.length;

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                m.put(nums[i], arr);
            }
        }

        int[] ans = new int[M];

        for (int i = 0; i < queries.length; i++) {
            if ((!m.containsKey(x) || queries[i] > m.get(x).size())) {
                ans[i] = -1;
            } else {
                ans[i] = (m.get(x).get(queries[i] - 1));
            }
        }
        return ans;
    }
}