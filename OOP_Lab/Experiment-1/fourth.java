import java.util.Scanner;

public class fourth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of meter : ");
        int meter = sc.nextInt();
        System.out.println("The value of meter into feet is : " + (meter * 3.28084));
        sc.close();
    }
}
