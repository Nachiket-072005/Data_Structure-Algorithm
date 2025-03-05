import java.util.Scanner;

public class Spoj_DivSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int N = 500001;
        int sumDivisor[] = new int[N];

        for (int i = 1; i < N; i++) {
            for (int j = 2 * i; j < N; j += i) {
                sumDivisor[j] += i;
            }
        }

        while (t > 0) {
            int n = in.nextInt();

            System.out.println(sumDivisor[n]);
            t--;
        }

        in.close();
    }
}
