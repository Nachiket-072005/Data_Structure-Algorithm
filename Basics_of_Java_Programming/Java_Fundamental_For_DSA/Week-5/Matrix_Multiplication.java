import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();
        int A[][] = new int[row][col];
        int B[][] = new int[row][col];
        int C[][] = new int[row][col];

        System.out.println("Enter first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // left for some reason
            }
        }
    }
}
