import java.util.Scanner;

public class CSES_Weird_Algo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // even -> n / 2
        // odd -> (3 * n) + 1
        System.out.print(n + " ");
        while (n != 1) {
            if (n * 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            System.out.print(n + " ");
            if (n == 1) {
                break;
            }
        }

        in.close();
    }
}