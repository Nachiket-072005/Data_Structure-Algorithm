import java.util.Scanner;

public class fifth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds : ");
        double weight = sc.nextDouble();
        System.out.println("Enter the height in inch : ");
        double height = sc.nextDouble();
        sc.close();

        weight *= 0.45359237;
        height *= 0.0254;

        double BMI = weight / (height * height);
        System.out.println("Your BMI is : " + BMI);
    }
}
