import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal = in.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = in.nextFloat();
        System.out.print("Enter the time period (in years): ");
        float time = in.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        in.close();
    }
}
