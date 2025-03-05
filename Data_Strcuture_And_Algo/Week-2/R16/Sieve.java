public class Sieve {
    public static void main(String[] args) {
        int n = 11;

        int countDivisor[] = new int[n];
        int sumDivisor[] = new int[n];

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j += i) {
                countDivisor[j]++;
                sumDivisor[j] += i;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.print(countDivisor[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            System.out.print(sumDivisor[i] + " ");
        }
    }
}