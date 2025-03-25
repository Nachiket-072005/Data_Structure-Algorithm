class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        return arr[k - 1];
    }
}
