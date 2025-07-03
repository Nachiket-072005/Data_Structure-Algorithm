import java.util.*;

public class ZeroOneBFS {
    static final int INF = Integer.MAX_VALUE;

    // n: number of nodes
    // adj: adjacency list where adj[u] = List of {v, w}
    // s: source node
    public static int[] zeroOneBFS(int n, List<List<int[]>> adj, int s) {
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[s] = 0;

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(s);

        while (!deque.isEmpty()) {
            int u = deque.pollFirst();
            for (int[] edge : adj.get(u)) {
                int v = edge[0], w = edge[1];
                if (dist[u] != INF && dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    if (w == 0)
                        deque.addFirst(v);
                    else
                        deque.addLast(v);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        // Example graph:
        // 0 --0--> 1, 0 --1--> 2, 1 --1--> 2, 2 --0--> 3, 3 --1--> 4
        adj.get(0).add(new int[] { 1, 0 });
        adj.get(0).add(new int[] { 2, 1 });
        adj.get(1).add(new int[] { 2, 1 });
        adj.get(2).add(new int[] { 3, 0 });
        adj.get(3).add(new int[] { 4, 1 });

        int start = 0;
        int[] distances = zeroOneBFS(n, adj, start);

        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + ": ");
            if (distances[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distances[i]);
            }
        }
    }
}
