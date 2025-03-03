import java.util.*;

public class Que_4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of elevators
        int k = sc.nextInt(); // Your current floor

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt(); // Elevator positions
        }

        int minTime = Integer.MAX_VALUE;
        int bestElevator = -1;

        for (int i = 0; i < n; i++) {
            int time = Math.abs(A[i] - k); // Time to reach the k-th floor
            if (time < minTime || (time == minTime && i + 1 < bestElevator)) {
                minTime = time;
                bestElevator = i; // 0-based index
            }
        }

        System.out.println(bestElevator);
        sc.close();
    }
}