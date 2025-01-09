import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
