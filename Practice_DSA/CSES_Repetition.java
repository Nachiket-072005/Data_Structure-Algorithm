import java.util.Scanner;

public class CSES_Repetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        int n = str.length();

        int max_rep = 1;
        char curr_char = str.charAt(0);
        int curr_rep = 1;

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == curr_char) {
                curr_rep++;
            } else {
                if (curr_rep > max_rep) {
                    max_rep = curr_rep;
                }
                curr_rep = 1;
                curr_char = str.charAt(i);
            }
        }

        if (curr_rep > max_rep) {
            max_rep = curr_rep;
        }

        System.out.println(max_rep);
        in.close();
    }
}
