import java.util.Scanner;

public class Print_Prime_Number_From_1_to_N {
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

        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
