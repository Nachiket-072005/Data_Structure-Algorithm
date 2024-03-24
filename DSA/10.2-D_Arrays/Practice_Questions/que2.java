package Practice_Questions;

public class que2 {
    public static int secondSum(int nums[][]) {
        int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[0].length; j++) {
        // if (i == 1) {
        // sum += nums[i][j];
        // }
        // }
        // }
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = secondSum(nums);
        System.out.println("Sum is : " + sum);
    }
}
