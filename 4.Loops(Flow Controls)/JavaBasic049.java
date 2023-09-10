
import java.util.Scanner;

// Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class JavaBasic049 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number, choice;
        int evenSum = 0, oddSum = 0;

        do{
            System.out.println("Enter the number : ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("The sum of even number is = " + evenSum);
        System.out.println("The sum of odd number is = " + oddSum);
    }
}
