import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = in.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + c);

        in.close();
    }
}
