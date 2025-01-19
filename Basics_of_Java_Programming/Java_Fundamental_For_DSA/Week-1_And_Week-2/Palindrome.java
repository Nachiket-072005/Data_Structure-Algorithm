import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int reverse = 0;
        int copyOfN = n;

        while (copyOfN > 0) {
            int lastDigit = copyOfN % 10;
            reverse = reverse * 10 + lastDigit;
            copyOfN /= 10;
        }

        if (n == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        in.close();
    }
}
