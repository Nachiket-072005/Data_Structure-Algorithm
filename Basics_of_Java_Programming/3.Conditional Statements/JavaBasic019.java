import java.util.*;

public class JavaBasic019 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("You can drive, vote etc");
        } else {
            System.out.println("You are not adult");
        }
    }
}
