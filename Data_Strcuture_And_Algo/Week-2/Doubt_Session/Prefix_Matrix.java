class NumMatrix {

    int prefix[][];
    public NumMatrix(int[][] matrix) {
        // Initialize the prefix matrix
        int N = matrix.length;
        int M = matrix[0].length;

        prefix = new int[N][M];
        // Step-1: Initialize the prefix matrix for 1st row
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum = sum + matrix[0][i];
            prefix[0][i] = sum; 
        }

        // Step-2: Initialize the prefix matrix for 1st col
        sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + matrix[i][0];
            prefix[i][0] = sum;
        }

        // Step-3: Initialize prefix matrix for all other elements
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        int answer = prefix[r2][c2];
        if (c1 >= 1) {
            answer -= prefix[r2][c1 - 1];
        }
        if (r1 >= 1) {
            answer -= prefix[r1 - 1][c2];
        }
        if (r1 >= 1 && c1 >= 1) {
            answer += prefix[r1 - 1][c1 - 1];
        }
        return answer;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */