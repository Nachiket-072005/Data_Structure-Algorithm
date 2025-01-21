import java.util.Scanner;

public class Print_Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
