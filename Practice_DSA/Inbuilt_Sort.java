import java.util.*;

public class Inbuilt_Sort {
    public static void printArr(Integer[] arr) {
        Integer n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] argos) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        printArr(arr);
    }
}
