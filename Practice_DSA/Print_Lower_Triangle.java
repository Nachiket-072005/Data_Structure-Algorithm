import java.util.Scanner;

public class Print_Lower_Triangle {
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

        // print lower triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
