import java.util.*;

public class sixth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");
        int a = sc.nextInt();
        System.out.println("Enter b  :");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        if (b > c && b > a) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (b > a) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        }
        sc.close();
    }
}