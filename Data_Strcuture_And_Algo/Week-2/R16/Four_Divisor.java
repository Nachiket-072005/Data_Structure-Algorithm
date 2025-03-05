class Solution {
    public int sumFourDivisors(int[] nums) {
        int N = 100000 + 1;
        int countDivisor[] = new int[N];
        int sumDivisor[] = new int[N];
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j += i) {
                countDivisor[j]++;
                sumDivisor[j] += i;
            }
        }

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (countDivisor[nums[i]] == 4) {
                count += sumDivisor[nums[i]];
            }
        }
        return count;
    }
}