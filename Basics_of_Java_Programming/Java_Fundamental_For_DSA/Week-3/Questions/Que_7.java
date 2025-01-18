import java.util.Scanner;

public class Que_7 {
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(sumOfDigits(n));

        in.close();
    }
}
