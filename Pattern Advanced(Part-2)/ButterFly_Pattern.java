public class ButterFly_Pattern {

    public static void butterFly(int n) {
        // 1st half pattern
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces - 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half pattern
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces - 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterFly(5);
    }
}