import java.util.*;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println();
        }

        in.close();
    }
}