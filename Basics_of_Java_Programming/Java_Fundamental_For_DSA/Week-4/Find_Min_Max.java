import java.util.Scanner;

public class Find_Min_Max {
    public static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
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

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Minimum : " + min + " And " + " Maximum : " + max);
        in.close();
    }
}
