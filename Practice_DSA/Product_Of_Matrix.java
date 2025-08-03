import java.util.Scanner;

public class Product_Of_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[][] = new int[n][n];
        int brr[][] = new int[n][n];
        int crr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                brr[i][j] = in.nextInt();
            }
        }

        // Multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int newElement = 0;
                for (int k = 0; k < n; k++) {
                    newElement = newElement + arr[i][k] * brr[k][j];
                }
                crr[i][j] = newElement;
            }
        }

        // Print Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
