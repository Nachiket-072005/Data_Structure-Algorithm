import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int leftSpace = 0;
        int middleSpace = 1 + 2 * (n - 2);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }

            if (i != n)
                System.out.print(i);

            leftSpace++;
            middleSpace -= 2;
            System.out.println();
        }

        leftSpace = n - 2;
        middleSpace = 1;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            leftSpace--;
            middleSpace += 2;
            System.out.println();
        }

        in.close();
    }
}
