import java.util.*;

class Solution {
    // Function to find the minimum number of platforms required
    static int findPlatform(int arr[], int dep[]) {
        List<List<Integer>> ar = new ArrayList<>();

        int n = arr.length;

        // Build events list with +1 for arrival, -1 for departure
        for (int i = 0; i < n; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(arr[i]);
            currRow.add(1); // Arrival → +1
            ar.add(new ArrayList<>(currRow));

            currRow = new ArrayList<>();
            currRow.add(dep[i]);
            currRow.add(-1); // Departure → -1
            ar.add(new ArrayList<>(currRow));
        }

        // BUG: When arrival and departure are same time,
        // arrival should come before departure to avoid undercounting platforms

        // FIX: Sort by time, but if same time then arrival (+1) before departure (-1)
        Collections.sort(ar, (x, y) -> {
            if (!x.get(0).equals(y.get(0)))
                return Integer.compare(x.get(0), y.get(0));
            else
                return Integer.compare(y.get(1), x.get(1)); // Arrival before Departure
        });

        int ans = 0;
        int maxVal = 0;

        // Traverse all events in sorted order
        for (int i = 0; i < 2 * n; i++) {
            ans += ar.get(i).get(1); // +1 or -1 depending on event
            maxVal = Math.max(maxVal, ans); // track max platforms needed at any point
        }

        return maxVal;
    }
}