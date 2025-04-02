class Solution {
    public boolean isPossible(long mid, int[] arr, int k) {
        int countOfPainter = 1;
        int time = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (time + arr[i] <= mid) {
                time += arr[i];
            }
            else {
                countOfPainter++;
                time = arr[i];
            }
        }
        return (countOfPainter <= k);
    }
    public int minTime(int[] arr, int k) {
        // code here
        // Part - 1
        long start = 0;
        long end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        
        long ans = 0;
        
        while(start <= end) {
            long mid = (start + end) / 2;
            
            if (isPossible(mid, arr, k) == true) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return (int)ans;
        
    }
}
