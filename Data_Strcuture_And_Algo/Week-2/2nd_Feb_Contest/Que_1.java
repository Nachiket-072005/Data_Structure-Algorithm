import java.util.*;

public class Que_1 {
    public static void prefix_Arr(int[] arr) {
        int i = 0;
        int n = arr.length;
        int prefix[] = new int[n];
        int sum = 0;
        while (i < n) {
            sum += arr[i];
            prefix[i] = sum;
            i++;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(prefix[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        prefix_Arr(arr);
        in.close();
    }
}