import java.util.Scanner;

public class Water_Melon_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();

        if (w >= 4 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
