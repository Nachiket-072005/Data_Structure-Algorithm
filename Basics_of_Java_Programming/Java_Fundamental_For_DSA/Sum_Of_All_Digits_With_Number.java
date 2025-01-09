import java.util.Scanner;

public class Sum_Of_All_Digits_With_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int copyOfI = i;
            while (copyOfI > 0) {
                int lastDigit = copyOfI % 10;
                sum += lastDigit;
                copyOfI /= 10;
            }
            System.out.println(i + " = " + sum);
        }

        in.close();
    }
}
