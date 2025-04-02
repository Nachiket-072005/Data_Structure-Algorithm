public class Solution {
    /**
     * @param x: a double
     * @return: the square root of x
     */
    public double sqrt(double x) {
        if (x == 0 || x == 1)
            return x;

        double start = 0.0;
        double end = (x < 1) ? 1.0 : x; // Adjust range for numbers < 1
        double diff = 1e-12;
        double ans = 0.0;

        while ((end - start) > diff) {
            double mid = (start + end) / 2.0;

            if (mid * mid <= x) {
                ans = mid;
                start = mid;
            } else {
                end = mid;
            }
        }
        return ans;
    }
}