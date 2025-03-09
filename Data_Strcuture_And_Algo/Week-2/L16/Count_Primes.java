import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        int sieve[] = new int[n];
        Arrays.fill(sieve, 1);

        // Initial it has zero value.
        sieve[0] = 0;
        sieve[1] = 0;

        // Remove all even nos
        for (int i = 4; i < n; i += 2) {
            sieve[i] = 0;
        }

        // Now we check for odd nos and divisible by ith nos so that no will be
        // eliminated

        for (long i = 3; i < n; i += 2) {
            if (sieve[(int) i] == 1) {
                for (long j = i * i; j < n; j += i) {
                    sieve[(int) j] = 0;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (sieve[i] == 1) {
                answer++;
            }
        }

        return answer;
    }
}