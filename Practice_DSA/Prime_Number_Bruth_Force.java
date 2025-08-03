import java.util.Scanner;

public class Prime_Number_Bruth_Force {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The number you gave is prime.");
        } else {
            System.out.println("The number you gave is not prime.");
        }
        in.close();
    }
}
