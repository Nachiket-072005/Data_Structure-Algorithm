import java.util.Scanner;

public class String_Que_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int maxFre = 0;
        char maxCh = ' ';

        for (int i = 0; i < str.length(); i++) {
            char fixedCh = str.charAt(i);
            int currFre = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == fixedCh) {
                    currFre++;
                }
            }
            if (currFre > maxFre) {
                maxFre = currFre;
                maxCh = fixedCh;
            }

        }

        System.out.println(maxCh);
        System.out.println(maxFre);

        in.close();
    }
}
