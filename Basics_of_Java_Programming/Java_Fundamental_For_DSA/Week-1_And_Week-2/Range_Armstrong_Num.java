import java.util.Scanner;

public class Range_Armstrong_Num {
    public static int pow(int base, int exponent) {
        int res = 1;
        for (int i = 1; i <= exponent; i++) {
            res *= base;
        }
        return res;
    }

    public static boolean isArmstrong(int n) {
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

        return n == sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range of start and end: ");
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
