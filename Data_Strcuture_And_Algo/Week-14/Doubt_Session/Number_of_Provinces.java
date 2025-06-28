class Solution {
    static int vis[];

    public static void dfs(int src, List<List<Integer>> adj) {
        vis[src] = 1;

        for (int i = 0; i < adj.get(src).size(); i++) {
            int neighbour = adj.get(src).get(i);

            if (vis[neighbour] == 0) {
                dfs(neighbour, adj);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();

        int n = isConnected.length;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        vis = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                ans++;
                dfs(i, adj);
            }
        }

        return ans;
    }
}