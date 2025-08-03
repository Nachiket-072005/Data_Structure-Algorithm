import java.util.Scanner;

public class String_Que_2 {
    public static boolean match(String s, String w, int startIdx) {
        int i = startIdx;
        int j = 0;

        while (i < s.length() && j < w.length()) {
            if (s.charAt(i) != w.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String word = in.next();

        for (int i = 0; i < str.length(); i++) {
            if (match(str, word, i) == true) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
