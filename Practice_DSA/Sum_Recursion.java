public class Sum_Recursion {
    public static int recur(int n) {
        int sum = 0;
        if (n == 1) {
            return n;
        }
        sum = n + recur(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println(recur(n));
    }
}
