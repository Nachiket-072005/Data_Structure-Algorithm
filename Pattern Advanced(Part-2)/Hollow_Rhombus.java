public class Hollow_Rhombus {

    public static void hollow_Rhombus(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // hollow_ractangle - code
            for (int j = 1; j <= n; j++) {
                // boundary cells
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_Rhombus(5);
    }
}