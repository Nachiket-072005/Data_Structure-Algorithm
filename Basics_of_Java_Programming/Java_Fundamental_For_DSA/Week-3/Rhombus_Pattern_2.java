import java.util.Scanner;

public class Rhombus_Pattern_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // Spaces

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Stars

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
