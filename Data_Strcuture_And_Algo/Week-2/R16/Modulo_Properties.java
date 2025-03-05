public class Modulo_Properties {
    public static void main(String[] args) {
        int N = 100;
        int sum = 0;
        int mod = 1000000000 + 7;

        for (int i = 0; i < N; i++) {
            sum = (sum % mod + i % mod) % mod;
        }

        System.out.println(sum);
    }
}
