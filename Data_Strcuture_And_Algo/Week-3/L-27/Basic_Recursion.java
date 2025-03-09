public class Basic_Recursion {
    public static void recur(int n) {
        // base case
        if (n < 1) {
            return;
        }

        // recursive case
        recur(n - 1);

        // logic
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // write your code here

        int n = 5;

        recur(n);
    }
}
