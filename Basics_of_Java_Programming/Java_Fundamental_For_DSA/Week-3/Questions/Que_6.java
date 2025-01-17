import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int stars = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {
            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            stars--;
            space += 2;
            System.out.println();
        }

        stars = 1;
        space -= 2;

        for (int i = 1; i <= n; i++) {
            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            stars++;
            space -= 2;
            System.out.println();
        }

        in.close();
    }
}
