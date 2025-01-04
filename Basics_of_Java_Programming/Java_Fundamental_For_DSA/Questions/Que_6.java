import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sub1 = in.nextDouble();
        double sub2 = in.nextDouble();
        double sub3 = in.nextDouble();
        double sub4 = in.nextDouble();
        double sub5 = in.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5;
        double percentage = total / 5;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage);

        in.close();
    }
}
