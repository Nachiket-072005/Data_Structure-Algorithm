import java.util.Scanner;

public class String_Que_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int maxFre = 0;
        char maxCh = ' ';
        for (int i = 0; i < s.length(); i++) {
            char fixedChar = s.charAt(i);
            int currFreq = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == fixedChar) {
                    currFreq++;
                }
            }

            if (currFreq > maxFre) {
                maxFre = currFreq;
                maxCh = fixedChar;
            }
        }

        System.out.println(maxCh);
        System.out.println(maxFre);
        in.close();
    }
}