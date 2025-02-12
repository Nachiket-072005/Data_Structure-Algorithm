import java.util.Scanner;

public class String_Func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        // concatenate
        String c = a + " " + b;
        System.out.println(c);
        System.out.println(a.concat(b));

        // compareTo
        System.out.println(a.compareTo(b));

        // substring
        System.out.println(a.substring(1, 4));
        System.out.println(b.substring(1, 4));

        in.close();
    }
}
