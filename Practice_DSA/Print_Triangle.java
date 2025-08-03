import java.util.Scanner;

public class Print_Triangle {
    public static void move(int R, int C, int[][] arr, int n) {
        while (R >= 0 && C < n) {
            System.out.print(arr[R][C] + " ");
            R--;
            C++;
        }
        System.out.println();
    }

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

        // First Row
        for (int i = 0; i < n; i++) {
            int R = i;
            int C = 0;

            move(R, C, arr, n);
        }

        // Second Col
        for (int j = 1; j < m; j++) {
            int R = n - 1;
            int C = j;

            move(R, C, arr, n);
        }

        in.close();
    }
}
