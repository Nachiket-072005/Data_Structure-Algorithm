class Solution {
    public static boolean isPossible(long mid, int[] stalls, int k) {
        int countCow = 1;
        int pos = stalls[0];

        for (int i = 0; i < stalls.length; i++) {
            if ((stalls[i] - pos) >= mid) {
                countCow++;
                pos = stalls[i];
            }
        }
        return (countCow >= k);
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        // Part - 1

        Arrays.sort(stalls);
        int n = stalls.length;

        long start = (long) Integer.MAX_VALUE;
        long end = stalls[n - 1] - stalls[0];
        long ans = 0;

        for (int i = 0; i < n - 1; i++) {
            start = Math.min((stalls[i + 1] - stalls[i]), start);
        }

        while (start <= end) {
            long mid = (start + end) / 2;

            if (isPossible(mid, stalls, k) == true) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }
}
