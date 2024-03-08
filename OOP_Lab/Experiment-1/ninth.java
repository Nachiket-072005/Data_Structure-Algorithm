import java.util.*;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        int digit1 = (number / 10000 + 1) % 10;
        int digit2 = ((number / 1000) % 10 + 1) % 10;
        int digit3 = ((number / 100) % 10 + 1) % 10;
        int digit4 = ((number / 10) % 10 + 1) % 10;
        int digit5 = (number % 10 + 1) % 10;

        int newNumber = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;

        System.out.println("New number after adding one to each digit: " + newNumber);

        sc.close();
    }
}
