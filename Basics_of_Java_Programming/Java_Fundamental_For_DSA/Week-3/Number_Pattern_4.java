import java.util.Scanner;

public class Number_Pattern_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int num = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            num--;
            System.out.println();
        }

        in.close();
    }
}
