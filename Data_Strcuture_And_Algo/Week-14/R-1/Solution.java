/**
 * Definition for a point.
 * class Point {
 * int x;
 * int y;
 * Point() { x = 0; y = 0; }
 * Point(int a, int b) { x = a; y = b; }
 * }
 */

class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class Solution {

    /**
     * @param grid:        a chessboard included 0 (false) and 1 (true)
     * @param source:      a point
     * @param destination: a point
     * @return: the shortest path
     */
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        int a = source.x;
        int b = source.y;

        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        for (int[] row : vis) {
            Arrays.fill(row, -1);
        }

        int c = destination.x;
        int d = destination.y;

        if (grid[c][d]) {
            return -1;
        }

        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(a, b));
        vis[a][b] = 0;

        while (!q.isEmpty()) {
            Pair<Integer, Integer> t = q.poll();
            int x = t.first;
            int y = t.second;

            if (x == c && y == d) {
                break;
            }

            // (x + 1, y + 2)
            if (x + 1 < n && y + 2 < m && vis[x + 1][y + 2] == -1 && !grid[x + 1][y + 2]) {
                vis[x + 1][y + 2] = vis[x][y] + 1;
                q.add(new Pair<>(x + 1, y + 2));
            }

            // (x + 1, y - 2)
            if (x + 1 < n && y - 2 >= 0 && vis[x + 1][y - 2] == -1 && !grid[x + 1][y - 2]) {
                vis[x + 1][y - 2] = vis[x][y] + 1;
                q.add(new Pair<>(x + 1, y - 2));
            }

            // (x - 1, y + 2)
            if (x - 1 >= 0 && y + 2 < m && vis[x - 1][y + 2] == -1 && !grid[x - 1][y + 2]) {
                vis[x - 1][y + 2] = vis[x][y] + 1;
                q.add(new Pair<>(x - 1, y + 2));
            }

            // (x - 1, y - 2)
            if (x - 1 >= 0 && y - 2 >= 0 && vis[x - 1][y - 2] == -1 && !grid[x - 1][y - 2]) {
                vis[x - 1][y - 2] = vis[x][y] + 1;
                q.add(new Pair<>(x - 1, y - 2));
            }

            // (x + 2, y + 1)
            if (x + 2 < n && y + 1 < m && vis[x + 2][y + 1] == -1 && !grid[x + 2][y + 1]) {
                vis[x + 2][y + 1] = vis[x][y] + 1;
                q.add(new Pair<>(x + 2, y + 1));
            }

            // (x + 2, y - 1)
            if (x + 2 < n && y - 1 >= 0 && vis[x + 2][y - 1] == -1 && !grid[x + 2][y - 1]) {
                vis[x + 2][y - 1] = vis[x][y] + 1;
                q.add(new Pair<>(x + 2, y - 1));
            }

            // (x - 2, y + 1)
            if (x - 2 >= 0 && y + 1 < m && vis[x - 2][y + 1] == -1 && !grid[x - 2][y + 1]) {
                vis[x - 2][y + 1] = vis[x][y] + 1;
                q.add(new Pair<>(x - 2, y + 1));
            }

            // (x - 2, y - 1)
            if (x - 2 >= 0 && y - 1 >= 0 && vis[x - 2][y - 1] == -1 && !grid[x - 2][y - 1]) {
                vis[x - 2][y - 1] = vis[x][y] + 1;
                q.add(new Pair<>(x - 2, y - 1));
            }
        }

        return vis[c][d];
    }
}