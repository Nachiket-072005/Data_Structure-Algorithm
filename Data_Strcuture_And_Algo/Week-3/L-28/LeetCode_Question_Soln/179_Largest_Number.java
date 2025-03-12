import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the nums array into string
        String numStrings[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = Integer.toString(nums[i]);
        }

        // Sort based on concatenated values
        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        // Handle the case where numString value has zero value
        if (numStrings[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNums = new StringBuilder();
        // Concatenate sorted string to form largest string
        for (String numString : numStrings) {
            largestNums.append(numString);
        }

        return largestNums.toString();
    }
}