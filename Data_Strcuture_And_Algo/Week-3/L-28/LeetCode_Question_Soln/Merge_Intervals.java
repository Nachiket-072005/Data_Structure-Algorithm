package LeetCode_Question_Soln;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                res.add(new int[] { start, end });
                start = currStart;
                end = currEnd;
            }
        }

        res.add(new int[] { start, end });

        return res.toArray(new int[res.size()][]);
    }
}