import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        int s = (a + b  + c) / 2;

        System.out.println("Area of triangle is : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        sc.close();
    }
}
