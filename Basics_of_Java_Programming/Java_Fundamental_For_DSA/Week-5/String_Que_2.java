import java.util.Scanner;

public class String_Que_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String word = in.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0)) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
