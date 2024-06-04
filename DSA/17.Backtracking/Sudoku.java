public class Sudoku {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;

        // 3X3 grid
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }

        // Recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 2, 7, 4, 0, 0, 1, 5 },
                { 8, 0, 0, 6, 0, 0, 0, 3, 7 },
                { 0, 0, 0, 5, 3, 0, 0, 0, 0 },
                { 5, 0, 7, 3, 0, 0, 0, 0, 1 },
                { 0, 8, 9, 0, 1, 0, 6, 5, 0 },
                { 2, 0, 0, 0, 0, 4, 7, 0, 3 },
                { 0, 0, 0, 0, 6, 5, 0, 0, 0 },
                { 1, 9, 0, 0, 0, 2, 0, 0, 6 },
                { 7, 6, 0, 0, 8, 3, 1, 0, 0 } };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Dosn't Exists");
        }
    }
}