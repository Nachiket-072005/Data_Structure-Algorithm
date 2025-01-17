import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int leftSpace = n - 1;

        for (int i = 1; i <= n; i++) {
            // leftSpaces
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            // Stars
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            leftSpace--;
            System.out.println();
        }

        in.close();
    }
}
