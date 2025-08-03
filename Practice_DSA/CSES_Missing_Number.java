import java.util.Scanner;

public class CSES_Missing_Number {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        long sum = 0;
        long N = n;

        long y = (N * (N + 1l)) / 2l;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long ans = y - sum;
        System.out.println(ans);
        in.close();
    }
}