public class Grid_Ways_Soln {
    public static int gridWays(int n, int m) {
        // Simple Math Formula to solve
        int totWays = (findFact(n - 1 + m - 1)) / (findFact(n - 1) + findFact(m - 1));
        return totWays;
    }
    // Time Complexity -> O(n + m)
    public static int findFact(int n) {
        // Base Case
        if (n == 1 || n == 0) {
            return n;
        }

        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(n, m));
    }
}