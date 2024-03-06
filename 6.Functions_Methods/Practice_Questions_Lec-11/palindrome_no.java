import java.util.*;

public class palindrome_no {
    public static void check_palindrome(int n) {
        int rev = 0;
        int num = n;
        while(num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num/10;
        }
        if(rev == n) {
            System.out.println("Given number is palindrome number");
        }
        else {
            System.out.println("Given number is not palindrome number");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        check_palindrome(n);
    }
}