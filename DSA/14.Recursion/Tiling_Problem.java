public class Tiling_Problem {
    public static int tilingProblem(int n) { // 2 x n(width size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical tiles
        int fnm1 = tilingProblem(n - 1);

        // horizontal tiles
        int fnm2 = tilingProblem(n - 2);

        // total ways
        int totTiles = fnm1 + fnm2;
        return totTiles;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}