import java.util.Scanner;

public class Nested_Try_Catch_Block {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 89;
        marks[2] = 78;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index : ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to Lecture Number 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // TODO: handle exception
                    System.out.println(e);
                    System.out.println("Exception in Level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }

        System.out.println("Thanks for using this program...");
    }
}