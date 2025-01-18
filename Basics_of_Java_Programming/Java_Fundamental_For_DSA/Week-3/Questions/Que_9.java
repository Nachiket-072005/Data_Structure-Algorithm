import java.util.Scanner;

public class Que_9 {
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

        int lowerLimit = in.nextInt();
        int upperLimit = in.nextInt();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
