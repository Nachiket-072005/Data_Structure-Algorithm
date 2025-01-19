import java.util.Scanner;

public class Que_18 {
    public static int gcd(int a, int b) {
        int res = Math.min(a, b);

        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        in.close();
    }
}
