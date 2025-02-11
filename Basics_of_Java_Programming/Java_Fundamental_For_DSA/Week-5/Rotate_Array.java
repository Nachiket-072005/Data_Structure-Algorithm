import java.util.Scanner;

public class Rotate_Array {
    public static void reverse(int row[]) {
        int i = 0;
        int j = row.length - 1;

        while (i < j) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;

            i++;
            j--;
        }
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

        // Transpose Array Code
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
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