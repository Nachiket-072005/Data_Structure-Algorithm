import java.util.Scanner;

public class Frequancy_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Step 1: Find the size of the frequancy array
        int maxNum = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        int size = maxNum + 1;
        int freq[] = new int[size];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < size; i++) {
            if (freq[i] > 0) {
                System.out.println("Element is " + i + " of frequancy has " + freq[i]);
            }
        }

        in.close();
    }
}