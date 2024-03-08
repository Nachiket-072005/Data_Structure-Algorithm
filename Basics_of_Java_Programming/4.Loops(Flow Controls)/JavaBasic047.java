import java.util.Scanner;

public class JavaBasic047 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int found = 1;
        if (n == 2) {
            System.out.println("The given number is prime no.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    found = 0;
                    break;
                }
            }
            if (found == 1) {
                System.out.println("The given number is prime no.");
            } else {
                System.out.println("The given number is not prime no.");
            }
        }
    }
}
