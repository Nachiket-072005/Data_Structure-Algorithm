import java.util.Scanner;

public class Armstrong_Num {

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int copyOfN = n;
        int count = 0;
        while (copyOfN > 0) {
            count++;
            copyOfN /= 10;
        }

        int sum = 0;
        copyOfN = n;

        while (copyOfN > 0) {
            int lastDigit = copyOfN % 10;
            sum += pow(lastDigit, count);
            copyOfN /= 10;
        }

        if (n == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        in.close();
    }
}
