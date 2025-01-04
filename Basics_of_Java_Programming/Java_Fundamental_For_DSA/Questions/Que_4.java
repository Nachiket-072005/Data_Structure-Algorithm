import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double l = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Area: " + (l * b));
        System.out.println("Perimeter: " + (2 * (l + b)));

        in.close();
    }
}
