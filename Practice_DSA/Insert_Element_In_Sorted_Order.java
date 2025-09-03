public class Insert_Element_In_Sorted_Order {

    public static void printArr(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8, 9, -1 };

        int n = arr.length;
        int index = -1;
        int t = 10;

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] >= t) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            arr[n - 1] = t;
            printArr(arr);
            return;
        }

        int j = n - 2;

        while (j >= index) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[index] = t;

        printArr(arr);
    }
}
