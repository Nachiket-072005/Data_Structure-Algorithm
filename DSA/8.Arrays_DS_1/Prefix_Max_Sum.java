public class Prefix_Max_Sum {

    public static void prefixMaxSum(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // prefix array
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Max sum is " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        prefixMaxSum(numbers);
    }
}