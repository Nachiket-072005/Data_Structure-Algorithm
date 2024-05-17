package Practice_Questions;

public class que3 {
    public static void printMatrix(int matrix[][]) {
        System.out.println("The Matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int row = 2, column = 3;
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // printMatrix
        printMatrix(matrix);

        // transpose of matrix
        int transpose[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print transpose matrix
        System.out.println("After Converted into Transpose Matrix:");
        printMatrix(transpose);
    }
}