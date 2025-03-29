class Solution {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }

        long start = 1;
        long mid = -1;
        long end = x;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return (int) mid;
            } else {
                start = mid + 1;
            }
        }

        return Math.round(end);
    }
}