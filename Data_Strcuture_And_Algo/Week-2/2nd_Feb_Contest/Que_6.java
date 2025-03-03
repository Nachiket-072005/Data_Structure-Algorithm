import java.util.*;

public class Que_6 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of students
        int k = sc.nextInt(); // Distance constraint

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt(); // Reading student roll numbers
        }

        int count = 0;

        for (int i = 0; i + k < N; i++) { // Ensuring we don't go out of bounds
            if (Math.abs(nums[i] - nums[i + k]) <= k) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}