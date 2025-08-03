import java.util.Scanner;

public class Prime_Number_Second_Approach {
    public static boolean checkPrime(int n) {

        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (checkPrime(n)) {
            System.out.println("The number you give is prime");
        } else {
            System.out.println("The number you give is not prime");
        }
        in.close();
    }
}
