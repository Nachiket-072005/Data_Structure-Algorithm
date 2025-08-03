import java.util.Scanner;

public class Swap_Diagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Swap Diagonal
        int j = 0;
        for (int i = 0; i < n; i++) {
            // Swap - (arr[i][j], arr[i][n - 1 - j])
            int temp = arr[i][j];
            arr[i][j] = arr[i][n - 1 - j];
            arr[i][n - 1 - j] = temp;

            j++;
        }

        // Print
        for (int i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
