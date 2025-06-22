class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a MAP for Frequancy of every elements
        HashMap<Integer, Integer> m = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        // Sort based on frequancy
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> (m.get(x) > m.get(y)) ? 1 : -1);

        int numberOfElementInPQ = 0;
        for (Integer key : m.keySet()) {
            if (numberOfElementInPQ < k) {
                pq.add(key);
                numberOfElementInPQ++;
            }

            else {
                if (m.get(key) > m.get(pq.peek())) {
                    // more deserve element
                    pq.remove();
                    pq.add(key);
                }
            }
        }

        int ans[] = new int[k];

        int index = 0;
        while (!pq.isEmpty()) {
            ans[index] = pq.poll();
            index++;
        }

        return ans;
    }
}