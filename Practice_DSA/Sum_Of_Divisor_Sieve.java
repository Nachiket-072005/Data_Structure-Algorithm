import java.util.Scanner;

public class Sum_Of_Divisor_Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] sumofdivisor = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                sumofdivisor[j] += i;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(sumofdivisor[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
