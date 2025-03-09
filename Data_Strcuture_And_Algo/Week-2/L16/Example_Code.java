import java.util.Arrays;
import java.util.Scanner;

public class Example_Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sieve[] = new int[n];
        Arrays.fill(sieve, 1);

        // Initial it has zero value.
        sieve[0] = 0;
        sieve[1] = 0;

        // Remove all even nos
        for (int i = 4; i < n; i += 2) {
            sieve[i] = 0;
        }

        // Now we check for odd nos and divisible by ith nos so that no will be
        // eliminated

        for (int i = 3; i < n; i += 2) {
            if (sieve[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = 0;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            if (sieve[i] == 1) {
                answer++;
            }
        }

        System.out.println(answer);
        in.close();
    }
}
