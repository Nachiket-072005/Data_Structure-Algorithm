package Practice_Questions;
import java.util.*;

public class inbuilt_sort_DESC {
    public static void printArr(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}