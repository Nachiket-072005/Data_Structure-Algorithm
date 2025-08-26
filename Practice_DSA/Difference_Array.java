import java.util.Scanner;

public class Difference_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] diff = new int[n + 1];
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int l, r, val;

            l = in.nextInt();
            r = in.nextInt();
            val = in.nextInt();

            diff[l] += val;
            diff[r + 1] -= val;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += diff[i];
            System.out.print((sum + arr[i]) + " ");
        }
        System.out.println();
        in.close();
    }
}