import java.util.Scanner;

public class Fibonacci_Series_Sum {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.print(fibonacci(n));

        in.close();
    }
}
