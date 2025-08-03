public class Basic_Recursion {

    public static void recur(int i, int n) {
        // Base Case
        if (i > n) {
            return;
        }

        System.out.print(i + " ");

        // recursive case
        recur(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;

        recur(1, n);
    }
}