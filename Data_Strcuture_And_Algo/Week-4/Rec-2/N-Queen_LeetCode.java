import java.util.ArrayList;

class Solution {
    List<List<String>> answer = new ArrayList<>();
    List<StringBuilder> chessBoard = new ArrayList<>();

    public boolean isSafe(int r, int c, int n) {
        for (int i = 0; i < r; i++) {
            if (chessBoard.get(i).charAt(c) == 'Q') {
                return false;
            }
        }

        // Diagonal checks
        int R = r, C = c;
        // Upward Left
        while (R >= 0 && C >= 0) {
            if (chessBoard.get(R).charAt(C) == 'Q') {
                return false;
            }
            R--;
            C--;
        }

        R = r;
        C = c;
        // Upward Right
        while (R >= 0 && C < n) {
            if (chessBoard.get(R).charAt(C) == 'Q') {
                return false;
            }
            R--;
            C++;
        }

        return true;
    }

    public void recur(int row, int n) {
        // Base case
        if (row == n) {
            List<String> currAns = new ArrayList<>();
            for (int i = 0; i < chessBoard.size(); i++) {
                currAns.add(chessBoard.get(i).toString());
            }
            answer.add(new ArrayList<>(currAns));
            return;
        }

        // Recursive case
        for (int j = 0; j < n; j++) {
            if (isSafe(row, j, n)) {
                chessBoard.get(row).setCharAt(j, 'Q');
                recur(row + 1, n);
                chessBoard.get(row).setCharAt(j, '.');
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        // Creating ChessBoard
        chessBoard.clear();
        answer.clear();

        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(".");
            }
            chessBoard.add(row);
        }

        recur(0, n);
        return answer;
    }
}
