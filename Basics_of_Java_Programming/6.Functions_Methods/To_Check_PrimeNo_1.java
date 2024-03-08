public class To_Check_PrimeNo_1 {

    public static boolean isPrime(int n) {
        // corner cases
        // if you have given an input 2
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(12));
    }
}