import java.util.*;

public class JavaBasic005_input_in_Java {
    public static void main(String args[]) {
        //Here, Scanner is class, sc is object and nextLine() is function that is pre-built in Java Packages which is defined by 1st line then it is use.
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}