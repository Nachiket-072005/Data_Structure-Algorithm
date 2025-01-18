import java.util.Scanner;

public class Function_2 {
    public static boolean checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (checkEvenOdd(n)) {
            System.out.println("Even Number!");
        } else {
            System.out.println("Odd Number!");
        }

        in.close();
    }
}
