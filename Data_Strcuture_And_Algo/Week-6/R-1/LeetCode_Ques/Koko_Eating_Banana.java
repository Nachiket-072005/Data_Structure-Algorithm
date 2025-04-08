class Solution {
    public boolean isPossible(int[] piles, long mid, int h) {
        long hours = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] < mid) {
                hours += 1;
            } else {
                if (piles[i] % mid == 0) {
                    hours += piles[i] / mid;
                } else if (piles[i] % mid != 0) {
                    hours += (piles[i] / mid) + 1;
                }
            }
        }

        return (hours <= h);
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        long start = 1;
        long end = 0;

        for (int i = 0; i < n; i++) {
            end = (long) Math.max(piles[i], end);
        }

        long ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            if (isPossible(piles, mid, h) == true) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) ans;
    }
}