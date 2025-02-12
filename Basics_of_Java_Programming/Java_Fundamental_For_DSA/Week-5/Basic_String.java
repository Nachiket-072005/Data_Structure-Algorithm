import java.util.Scanner;

public class Basic_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char ch = s.charAt(0);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(s.length());

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        in.close();
    }
}
