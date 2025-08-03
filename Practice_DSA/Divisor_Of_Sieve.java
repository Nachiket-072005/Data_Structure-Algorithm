import java.util.Scanner;

public class Divisor_Of_Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] divisor = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                divisor[j]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(divisor[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
