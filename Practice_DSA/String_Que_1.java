import java.util.*;

public class String_Que_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char target = in.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}