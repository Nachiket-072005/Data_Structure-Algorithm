import java.util.Scanner;

public class Find_Median {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        if (n % 2 != 0) {
            System.out.println("Median is " + arr[n / 2]);
        } else {
            double median = (double) (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
            System.out.println("Median is " + median);
        }

        in.close();
    }
}
