import java.util.Scanner;

public class Check_Ele {
    public static int checkIfPresent(int ele, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return i;
            }
        }

        return -1;
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

        int ele = 3;
        int idx = checkIfPresent(ele, arr);

        if (idx != -1) {
            System.out.println("Element is present in an array at " + idx);
        } else {
            System.out.println("Element is not present in an array!");
        }

        in.close();
    }
}
