import java.util.ArrayList;

class Solution {
    // Function to find all possible paths
    ArrayList<String> answer = new ArrayList<>();
    ArrayList<Character> currSeq = new ArrayList<>();
    int[][] vis;

    public void recur(int i, int j, ArrayList<ArrayList<Integer>> mat, int n) {
        // Base case
        if (i == n - 1 && j == n - 1) {
            StringBuilder currAns = new StringBuilder();
            for (char ch : currSeq) {
                currAns.append(ch);
            }
            answer.add(currAns.toString());
            return;
        }

        // Recursive case - Options (D, L, R, U) in lexicographical order
        if (i + 1 < n && mat.get(i + 1).get(j) == 1 && vis[i + 1][j] == 0) { // Down Condition
            currSeq.add('D');
            vis[i + 1][j] = 1;
            recur(i + 1, j, mat, n);
            currSeq.remove(currSeq.size() - 1);
            vis[i + 1][j] = 0;
        }
        if (j >= 1 && mat.get(i).get(j - 1) == 1 && vis[i][j - 1] == 0) { // Left Condition
            currSeq.add('L');
            vis[i][j - 1] = 1;
            recur(i, j - 1, mat, n);
            currSeq.remove(currSeq.size() - 1);
            vis[i][j - 1] = 0;
        }
        if (j + 1 < n && mat.get(i).get(j + 1) == 1 && vis[i][j + 1] == 0) { // Right Condition
            currSeq.add('R');
            vis[i][j + 1] = 1;
            recur(i, j + 1, mat, n);
            currSeq.remove(currSeq.size() - 1);
            vis[i][j + 1] = 0;
        }
        if (i >= 1 && mat.get(i - 1).get(j) == 1 && vis[i - 1][j] == 0) { // Up Condition
            currSeq.add('U');
            vis[i - 1][j] = 1;
            recur(i - 1, j, mat, n);
            currSeq.remove(currSeq.size() - 1);
            vis[i - 1][j] = 0;
        }
    }

    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        answer.clear();
        vis = new int[n][n];

        if (n > 0 && mat.get(0).get(0) == 1) {
            vis[0][0] = 1;
            recur(0, 0, mat, n);
        }

        return answer;
    }
}
