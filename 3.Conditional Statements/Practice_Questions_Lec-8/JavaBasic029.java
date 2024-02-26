import java.util.*;
public class JavaBasic029 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        if(num >= 0) {
            System.out.println("Given num is positive.");
        } 
        else {
            System.out.println("Given num is negative.");
        }
    }
}