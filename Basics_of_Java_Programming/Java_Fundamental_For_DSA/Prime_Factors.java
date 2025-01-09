import java.util.Scanner;

public class Prime_Factors {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i) == true) {
                    System.out.print(i + " ");
                }
            }
        }

        in.close();
    }
}
