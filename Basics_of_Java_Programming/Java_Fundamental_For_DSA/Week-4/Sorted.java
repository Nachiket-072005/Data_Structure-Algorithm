import java.util.Scanner;

public class Sorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Enter the " + i + "th index value: ");
            arr[i] = in.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is not sorted!");
        }
        in.close();
    }
}
