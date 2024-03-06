import java.util.*;

public class sum_of_digits {

    public static int sumOfDigit(int n) {
        int sum = 0;
        int num = n;
        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = sumOfDigit(n);
        System.out.println("Sum of digits is : " + sum);
    }
}