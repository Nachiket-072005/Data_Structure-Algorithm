import java.util.Scanner;

public class Prefix_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Prefix array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print Prefix Array
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

        in.close();
    }
}