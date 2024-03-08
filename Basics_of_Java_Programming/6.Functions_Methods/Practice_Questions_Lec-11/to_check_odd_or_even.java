import java.util.*;

public class to_check_odd_or_even {
    public static void printOddEven(int n) {
        if(n % 2 == 0) {
            System.out.println("Even No.");
        }
        else {
            System.out.println("Odd No.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printOddEven(n);
    }
}