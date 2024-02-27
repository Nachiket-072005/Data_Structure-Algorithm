import java.util.Scanner;

public class eight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = sc.nextInt();

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes10 = amount / 10;
        amount %= 10;

        int notes5 = amount / 5;
        amount %= 5;

        int notes2 = amount / 2;
        amount %= 2;

        int notes1 = amount;

        // Display the result
        System.out.println("Number of 100 notes: " + notes100);
        System.out.println("Number of 50 notes: " + notes50);
        System.out.println("Number of 10 notes: " + notes10);
        System.out.println("Number of 5 notes: " + notes5);
        System.out.println("Number of 2 notes: " + notes2);
        System.out.println("Number of 1 notes: " + notes1);
        sc.close();
    }
}