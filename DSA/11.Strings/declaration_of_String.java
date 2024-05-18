import java.util.Scanner;

public class declaration_of_String {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        // Syntax 1:
        String str1 = "abcd";
        // Syntax 2:
        String str2 = new String("xyz");

        // NOTE THAT: Strings are IMMUTABLE.

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
    }
}