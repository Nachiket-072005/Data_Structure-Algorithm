import java.util.*;

public class Print_Diagonal_Matrix {
    public static void movement(int R, int C, int[][] arr, int colSize) {
        int i = R;
        int j = C;

        while (i >= 0 && j < colSize) {
            System.out.print(arr[i][j] + " ");
            i--;
            j++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int R = i;
            int C = 0;

            movement(R, C, arr, col);
        }

        for (int j = 1; j < col; j++) {
            int R = row - 1;
            int C = j;

            movement(R, C, arr, col);
        }

        in.close();
    }
}