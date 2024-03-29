package Practice_Questions;

public class insertion_sort_DESC {
    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out correct position to insert an element
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSort(arr);
        printArr(arr);
    }
}