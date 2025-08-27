import java.util.Scanner;

public class CSES_Weird_Algo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        System.out.print(n + " ");
        while (n != 1) {
            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.print(n + " ");
        }

        in.close();
    }
}
