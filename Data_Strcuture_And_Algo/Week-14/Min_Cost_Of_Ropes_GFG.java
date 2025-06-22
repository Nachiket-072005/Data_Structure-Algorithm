class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int n = arr.length;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            q.add(arr[i]);
        }

        while (q.size() >= 2) {
            int a = q.peek();
            q.poll();
            int b = q.peek();
            q.poll();

            int cost = a + b;
            ans += cost;
            q.add(cost);
        }

        return ans;
    }
}