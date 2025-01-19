import java.util.Scanner;

public class Que_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int product = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            product *= lastDigit;
            n /= 10;
        }

        System.out.println("Product of all the digits : " + product);
        in.close();
    }
}
