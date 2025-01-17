import java.util.Scanner;

public class Diamond_Patter_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space--;
            star += 2;
            System.out.println();
        }

        star = star - 4;
        space = 1;

        for (int i = 1; i <= n - 1; i++) {
            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            space++;
            star -= 2;
            System.out.println();

        }

        in.close();
    }
}
