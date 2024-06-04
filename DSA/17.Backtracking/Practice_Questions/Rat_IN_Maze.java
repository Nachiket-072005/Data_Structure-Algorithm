package Practice_Questions;

/*
Algorithm:-
1. Create a solution matrix, initially filled with 0’s.
2. Create a recursive function, which takes the initial matrix, output matrix and position
of rat (i, j).
3. if the position is out of the matrix or the position is not valid then return.
4. Mark the position output[i][j] as 1 and check if the current position is destination or
not. If destination is reached print the output matrix and return.
5. Recursively call for position (i+1, j) and (i, j+1).
6. Unmark position (i, j), i.e output[i][j] = 0.
*/

public class Rat_IN_Maze {

    public static void printSolution(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        // if (x, y outside maze) return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solveMaze(int[][] maze) {
        int N = maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist.");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == sol.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // check maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            if (sol[x][y] == 1) {
                return true;
            }
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}