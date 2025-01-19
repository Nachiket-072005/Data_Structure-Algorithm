import java.util.Scanner;

public class Que_21 {
    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static int lastDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(" First Digit : " + firstDigit(n) + ", Last Digit : " + lastDigit(n));

        in.close();
    }
}
