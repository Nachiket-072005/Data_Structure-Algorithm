import java.util.Scanner;

public class isArmstrong_Function {
    public static int pow(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }

    public static boolean isArmstrong(int n) {
        int count = 0;
        int sum = 0;
        int x = n;

        while (x > 0) {
            count++;
            x /= 10;
        }
        x = n;
        while (x > 0) {
            int lastDigit = x % 10;
            sum += pow(lastDigit, count);
            x /= 10;
        }

        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i) == true) {
                System.out.println(i);
            }
        }

        in.close();
    }
}
