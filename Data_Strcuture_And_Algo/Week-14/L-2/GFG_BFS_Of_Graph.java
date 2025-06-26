class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        int[] vis = new int[n];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = 1;
        
        while(q.size() > 0) {
            // Step 1: Get the topmost vertex & add it to the ans
            int topVertex = q.remove();
            ans.add(topVertex);
            
            // Step 2: Visit its neighbours & do the iterative approach
            for(int i = 0; i < adj.get(topVertex).size(); i++) {
                int neighbour = adj.get(topVertex).get(i);
                
                if(vis[neighbour] == 0) {
                    q.add(neighbour);
                    vis[neighbour] = 1;
                }
            }
        }
        
        return ans;
    }
}