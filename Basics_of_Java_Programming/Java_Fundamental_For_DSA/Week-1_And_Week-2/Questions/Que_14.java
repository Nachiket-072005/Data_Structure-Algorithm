import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("Divisible by 5 and 11.");
        } else {
            System.out.println("Not divisible by 5 and 11.");
        }

        in.close();
    }
}
