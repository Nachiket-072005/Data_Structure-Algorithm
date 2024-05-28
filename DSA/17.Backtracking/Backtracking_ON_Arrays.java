public class Backtracking_ON_Arrays {
    public static void changArr(int[] arr, int i, int val) {
        // Base Case Condition
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // Time & Space Complexcity -> O(n)
        // Recursion
        arr[i] = val;
        changArr(arr, i + 1, val + 1); // Function Call Steps
        arr[i] = arr[i] - 2; // Backtracking Steps
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changArr(arr, 0, 1);
        printArr(arr);
    }
}