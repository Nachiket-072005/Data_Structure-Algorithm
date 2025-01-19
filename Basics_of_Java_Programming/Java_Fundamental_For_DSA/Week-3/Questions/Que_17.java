import java.util.Scanner;

public class Que_17 {
    public static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    public static int min(int a, int b) {
        int min = (b > a) ? a : b;
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Maximum : " + max(a, b));
        System.out.println("Minimum : " + min(a, b));

        in.close();
    }
}
