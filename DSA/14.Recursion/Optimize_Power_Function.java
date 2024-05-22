public class Optimize_Power_Function {
    public static int optimizePower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = optimizePower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq *= x;
        }

        return halfPowerSq;
    }

    // TC = O(logn)
    public static void main(String[] args) {
        int x = 2, n = 10;
        int res = optimizePower(x, n);
        System.out.println(res);
    }
}