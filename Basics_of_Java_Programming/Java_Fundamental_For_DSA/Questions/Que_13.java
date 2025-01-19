import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n > 0) {
            System.out.println("Number is Positive.");
        } else if (n < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is zero.");
        }

        in.close();
    }
}
