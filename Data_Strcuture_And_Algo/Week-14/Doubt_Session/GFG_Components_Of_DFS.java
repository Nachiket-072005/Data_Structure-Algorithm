class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> ans;
    int vis[];

    public void dfs(int src, ArrayList<ArrayList<Integer>> adj) {
        vis[src] = 1;
        ans.add(src);

        for (int i = 0; i < adj.get(src).size(); i++) {
            int neighbour = adj.get(src).get(i);

            if (vis[neighbour] == 0) {
                dfs(neighbour, adj);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ans = new ArrayList<>();
        int n = adj.size();

        vis = new int[n];

        // For Multiple components
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(0, adj);
            }
        }

        return ans;
    }
}