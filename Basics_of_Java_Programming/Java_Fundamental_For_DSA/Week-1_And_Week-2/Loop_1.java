import java.util.Scanner;

public class Loop_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);

        in.close();
    }
}