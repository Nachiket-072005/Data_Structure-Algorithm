import java.util.Scanner;

public class Diagonal_Sum {
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

        // Diagonal Sum - Both
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum = " + sum);
        in.close();
    }
}
