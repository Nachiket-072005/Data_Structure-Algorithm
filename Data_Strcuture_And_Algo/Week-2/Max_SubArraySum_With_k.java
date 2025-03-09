class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int n = arr.length;

        int currSum = 0;
        int maxSum = 0;
        int i = 0;
        // sum of first k element
        while (i < k) {
            currSum += arr[i];
            i++;
        }

        maxSum = currSum;

        while (i < n) {
            currSum += arr[i];
            currSum -= arr[i - k];
            i++;

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}