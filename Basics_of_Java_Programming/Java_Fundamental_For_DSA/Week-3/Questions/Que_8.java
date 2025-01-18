import java.util.Scanner;

public class Que_8 {
    public static String checkMaxMin(int a, int b) {
        if (a > b) {
            return a + " is max & " + b + " is min.";
        } else {
            return b + " is max & " + a + " is min.";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(checkMaxMin(a, b));

        in.close();
    }
}
