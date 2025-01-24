import java.util.Scanner;

public class Linear_Search {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        int target = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int res = linearSearch(arr, target);
        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {

            System.out.println("Element not found!");
        }
        in.close();
    }
}
