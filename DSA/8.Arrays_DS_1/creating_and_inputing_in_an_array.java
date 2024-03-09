import java.util.*;

public class creating_and_inputing_in_an_array {
    public static void main(String args[]) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of phy : ");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of chem : ");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of math : ");
        marks[2] = sc.nextInt();

        System.out.println("Your marks of phy, chem and math respectively: " + marks[0]+ "," + marks[1] + " and " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Your percentage is : " + percentage + "%");

        //If we want to find length of array using java below kind of program will be execute then it will give length of an array.
        System.out.println("Length of array is : " + marks.length); 
        sc.close();
    }
}