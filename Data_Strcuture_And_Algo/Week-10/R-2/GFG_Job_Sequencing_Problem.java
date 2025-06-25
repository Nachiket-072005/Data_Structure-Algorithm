class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Create list of jobs (profit, deadline)
        ArrayList<int[]> jobs = new ArrayList<>();
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs.add(new int[] { profit[i], deadline[i] });
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        // Step 2: Sort jobs by profit in descending order
        Collections.sort(jobs, (a, b) -> b[0] - a[0]);

        // Step 3: Create time slots
        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int totalJobs = 0;
        int maxProfit = 0;

        // Step 4: Assign jobs
        for (int i = 0; i < n; i++) {
            int currProfit = jobs.get(i)[0];
            int currDeadline = jobs.get(i)[1];

            for (int j = currDeadline; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = i;
                    totalJobs++;
                    maxProfit += currProfit;
                    break;
                }
            }
        }

        result.add(totalJobs);
        result.add(maxProfit);
        return result;
    }
}