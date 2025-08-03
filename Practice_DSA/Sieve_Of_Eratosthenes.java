import java.util.Arrays;
import java.util.Scanner;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] sieve = new int[n + 1];

        Arrays.fill(sieve, 1);

        sieve[0] = 0;
        sieve[1] = 0;

        // Remove all even numbers
        for (int i = 4; i <= n; i += 2) {
            sieve[i] = 0;
        }

        // Remove all odd numbers
        for (int i = 3; i <= n; i += 2) {
            if (sieve[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = 0;
                }
            }
        }

        // Print all prime number
        for (int i = 1; i <= n; i++) {
            if (sieve[i] == 1) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
