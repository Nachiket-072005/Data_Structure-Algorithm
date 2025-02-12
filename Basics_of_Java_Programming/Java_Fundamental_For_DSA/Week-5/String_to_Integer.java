import java.util.Scanner;

public class String_to_Integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "123";

        int a = Integer.parseInt(s);

        String b = Integer.toString(a);

        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        in.close();
    }
}
