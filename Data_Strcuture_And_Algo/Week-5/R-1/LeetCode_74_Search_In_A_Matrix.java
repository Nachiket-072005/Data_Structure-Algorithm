class Solution {
    public boolean binarySearch(int[][] mat, int target, int r) {
        int st = 0;
        int end = mat[r].length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (mat[r][mid] == target) {
                return true;
            } else if (mat[r][mid] < target) {
                st = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int st = 0;
        int end = m - 1; // Should be row-based, not column-based
        int res = -1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (matrix[mid][n - 1] >= target) {
                res = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        // Ensure a valid row index
        if (res == -1)
            return false;

        return binarySearch(matrix, target, res);
    }
}
