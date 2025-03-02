import java.util.Scanner;

public class Diff_Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // difference array
        int diff[] = new int[n + 1];
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int val = in.nextInt();

            diff[l] += val;
            diff[r + 1] -= val;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];

            arr[i] += sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
