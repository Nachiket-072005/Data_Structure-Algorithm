import java.util.Scanner;

public class Rotate_Array {
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

        // Transpose Array Code
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j || i > j) {
                    arr[i][j] = arr[j][i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}