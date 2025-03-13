import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        int n = intervals.length;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> currRow = new ArrayList<>();
            currRow.add(intervals[i][0]);
            currRow.add(intervals[i][1]);

            arr.add(new ArrayList<Integer>(currRow));
        }

        Collections.sort(arr, (x, y) -> Integer.compare(x.get(0), y.get(0)));

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        answer.add(new ArrayList<>(arr.get(0)));
        int L = arr.get(0).get(0);
        int R = arr.get(0).get(1);

        for (int i = 1; i < n; i++) {
            int x = arr.get(i).get(0);
            int y = arr.get(i).get(1);
            if (x >= L && x <= R) {
                answer.get(answer.size() - 1).set(1, Math.max(R, y));
            } else {
                answer.add(new ArrayList<>(arr.get(i)));
            }

            L = answer.get(answer.size() - 1).get(0);
            R = answer.get(answer.size() - 1).get(1);
        }

        int N = answer.size();
        int ans[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            ans[i][0] = answer.get(i).get(0);
            ans[i][1] = answer.get(i).get(1);
        }

        return ans;
    }
}