import java.util.Scanner;

public class Sum_Of_Diagonal {
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

        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sumL += arr[i][j];
                }
                if ((i + j) == n - 1) {
                    sumR += arr[i][j];
                }
            }
        }
        System.out.println(sumL);
        System.out.println(sumR);
        in.close();
    }
}
