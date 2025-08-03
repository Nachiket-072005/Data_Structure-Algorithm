import java.util.Scanner;

public class Freq_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxEle = -1;
        for (int i = 0; i < n; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }

        // Freq array
        int[] freq = new int[maxEle + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // print out freq arr
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }

        in.close();
    }
}