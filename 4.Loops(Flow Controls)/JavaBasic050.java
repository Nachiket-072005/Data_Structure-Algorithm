
import java.util.Scanner;

//Question 3 : Write a program to find the factorial of any number entered by the user.

public class JavaBasic050 {
    public static void main(String args[]) {
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is = " + fact);
    }
}
