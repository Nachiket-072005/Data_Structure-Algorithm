import java.util.Scanner;

public class subArraySum_Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // print SubArray sum
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += arr[j];
                System.out.println(i + " -> " + j + " = " + sum);
            }
        }

        in.close();
    }
}
