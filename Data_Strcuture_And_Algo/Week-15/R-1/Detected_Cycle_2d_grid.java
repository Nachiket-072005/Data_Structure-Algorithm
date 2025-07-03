public class Detected_Cycle_2d_grid {
    // Directions: down, up, right, left
    private static final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public boolean containsCycle(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        // Check each cell as potential cycle start
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && hasCycle(grid, visited, i, j, -1, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasCycle(char[][] grid, boolean[][] visited,
            int x, int y, int prevX, int prevY) {
        visited[x][y] = true;

        // Explore all four directions
        for (int[] dir : DIRECTIONS) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            // Skip parent cell and check boundaries
            if (newX == prevX && newY == prevY)
                continue;
            if (newX < 0 || newY < 0 || newX >= grid.length || newY >= grid[0].length)
                continue;

            // Check if same character group
            if (grid[newX][newY] == grid[x][y]) {
                // Found visited cell that's not parent => cycle detected
                if (visited[newX][newY])
                    return true;

                // Continue DFS exploration
                if (hasCycle(grid, visited, newX, newY, x, y)) {
                    return true;
                }
            }
        }

        return false;
    }
}