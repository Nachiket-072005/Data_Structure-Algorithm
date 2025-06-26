class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];

            // x -- y
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[n];

        q.add(source);
        vis[source] = 1;

        while (q.size() > 0) {
            int topVertex = q.remove();

            if (topVertex == destination) {
                return true;
            }

            for (int i = 0; i < adj.get(topVertex).size(); i++) {
                int neighbour = adj.get(topVertex).get(i);

                if (vis[neighbour] == 0) {
                    q.add(neighbour);
                    vis[neighbour] = 1;
                }
            }
        }

        return false;
    }
}