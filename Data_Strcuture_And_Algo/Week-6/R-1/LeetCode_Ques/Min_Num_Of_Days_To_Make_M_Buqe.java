class Solution {
    public boolean isPossible(int[] arr, long day, int m, int k) {
        int count = 0;
        int noOfB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);

        return (noOfB >= m);
    }

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        long start = (long) Integer.MAX_VALUE;
        long end = (long) Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            start = Math.min(start, bloomDay[i]);
            end = Math.max(end, bloomDay[i]);
        }

        long ans = -1;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (isPossible(bloomDay, mid, m, k) == true) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) ans;
    }
}