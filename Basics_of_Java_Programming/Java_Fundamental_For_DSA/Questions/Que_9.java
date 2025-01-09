import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        int value = ch;

        if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
            System.out.println("Alphabet");
        } else if (value >= 48 && value <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        in.close();
    }
}
