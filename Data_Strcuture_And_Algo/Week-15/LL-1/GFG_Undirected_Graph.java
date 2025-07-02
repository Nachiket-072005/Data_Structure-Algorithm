class Solution {
    boolean isCycle;
    int vis[];
    ArrayList<ArrayList<Integer>> adj;
    
    public void dfs(int src, int parent) {
        vis[src] = 1;
        
        for(int i = 0; i < adj.get(src).size(); i++) {
            int neighbour = adj.get(src).get(i);
            
            if(vis[neighbour] == 0) {
                dfs(neighbour, src);
            }
            else if(neighbour != parent) {
                isCycle = true;
            }
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        isCycle = false;
        adj = new ArrayList<>();
        vis = new int[V];
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        
        for(int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                dfs(i, -1);
            }
        }
        
        return isCycle;
    }
}