public class program_5 {

    public static void printArr(int[] arr) {
        int n = arr.length;
        System.out.printf("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.printf("%d]", arr[i]);
            } else {
                System.out.printf("%d, ", arr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 1, 98, 3, 68, 9, 123, 54 };
        printArr(arr);
        int min_index, temp, len = arr.length;
        for (int i = 0; i < len; i++) {
            min_index = i;
            for (int j = i; j < len; j++) {
                if (arr[j] <= arr[min_index]) {
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        printArr(arr);
    }

}