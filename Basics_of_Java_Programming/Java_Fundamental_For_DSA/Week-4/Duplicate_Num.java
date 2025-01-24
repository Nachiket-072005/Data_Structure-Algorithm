import java.util.Scanner;

public class Duplicate_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maximumNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maximumNumber = Math.max(maximumNumber, arr[i]);
        }

        int freq[] = new int[maximumNumber + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
