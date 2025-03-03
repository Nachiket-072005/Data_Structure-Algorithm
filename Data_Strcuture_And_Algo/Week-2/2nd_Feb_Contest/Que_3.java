import java.util.*;

public class Que_3 {
    // It doesn't work for all test cases.
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of people
            int X = sc.nextInt(); // Train ticket cost per person
            int Y = sc.nextInt(); // Cab cost per trip

            // Calculate train cost
            int trainCost = N * X;

            // Calculate cab cost
            int numCabs = (N + 2) / 3; // Equivalent to ceil(N/3)
            int cabCost = numCabs * Y;

            // Choose the minimum cost
            output.append(Math.min(trainCost, cabCost)).append("\n");
        }

        System.out.print(output);
        sc.close();
    }
}