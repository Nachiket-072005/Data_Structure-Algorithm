public class Fibonacci_Recursion {
    public static int recur(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = recur(n - 1) + recur(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(recur(n));
    }
}
