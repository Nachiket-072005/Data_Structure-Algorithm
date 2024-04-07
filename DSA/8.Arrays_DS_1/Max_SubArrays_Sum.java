public class Max_SubArrays_Sum {

    //This is the BROUTE FORCE approach to solve this problem because in this problem TIME COMPLEXITY = O(n^3)

    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("currSum = " + currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is = " + maxSum);
        System.out.println("Min Sum is = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
    }
}