import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        System.out.println(sum);

        in.close();
    }
}
