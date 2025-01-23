import java.util.Scanner;

public class Print_EvenOdd_Array_Ele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int even[] = new int[countEven];
        int odd[] = new int[countOdd];

        if (countEven > 0) {
            int indexEven = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even[indexEven] = arr[i];
                    indexEven++;
                }
            }
        }

        if (countOdd > 0) {
            int indexOdd = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    odd[indexOdd] = arr[i];
                    indexOdd++;
                }
            }
        }

        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
