import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_IF_TWO_COMPONENTS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = adj.size();
        int[] vis = new int[n];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int[] level = new int[n];

        // If Two components are there so, we'll use this code
        for (int k = 0; k < n; k++) {
            if (vis[k] == 0) {
                count++;
                q.add(k);
                vis[k] = 1;
                level[k] = 1;
                while (q.size() > 0) {
                    // Step 1: Get the topmost vertex & add it to the ans
                    int topVertex = q.remove();
                    ans.add(topVertex);

                    // Step 2: Visit its neighbours & do the iterative approach
                    for (int i = 0; i < adj.get(topVertex).size(); i++) {
                        int neighbour = adj.get(topVertex).get(i);

                        if (vis[neighbour] == 0) {
                            q.add(neighbour);
                            vis[neighbour] = 1;
                            level[neighbour] = level[topVertex] + 1;
                        }
                    }
                }
                System.out.println(level);
                System.out.println(count);
            }
        }

        return ans;
    }
}
