class Solution {
    public int numFriendRequests(int[] ages) {
        int[] freq = new int[121]; // Frequency array to count occurrences of each age
        int[] prefix = new int[121]; // Prefix sum array for cumulative counts

        // Fill the frequency array
        for (int age : ages) {
            freq[age]++;
        }

        // Build the prefix sum array
        for (int i = 1; i <= 120; i++) {
            prefix[i] = prefix[i - 1] + freq[i];
        }

        int count = 0;

        // Iterate through each possible age
        for (int age = 15; age <= 120; age++) { // Start from 15, as younger ages won't send requests

            if (freq[age] == 0)
                continue; // Skip ages that are not present

            int minAge = (age / 2) + 7; // Minimum valid age for friend request
            int possibleRequests = prefix[age] - prefix[minAge]; // Count of valid friends

            count += possibleRequests * freq[age] - freq[age]; // Avoid self-requests
        }

        return count;
    }
}