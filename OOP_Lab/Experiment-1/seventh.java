import java.util.Scanner;

public class seventh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'a' ||
            ch == 'E' || ch == 'e' ||
            ch == 'I' || ch == 'i' ||
            ch == 'O' || ch == 'o' ||
            ch == 'U' || ch == 'u') {
            System.out.println("Entered character is vowel");
        } else {
            System.out.println("Entered character is consonants");
        }
        sc.close();
    }
}
