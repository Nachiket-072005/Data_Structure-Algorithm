import java.util.Scanner;

public class Que_10 {
    public static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int nCr(int n, int r) {
        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n - r);

        int res = nFact / (rFact * nmrFact);
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println(nCr(n, r));

        in.close();
    }
}
