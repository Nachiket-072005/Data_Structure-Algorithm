public class Find_Occurances_Of_K_Using_Recursion {
    public static void findOccur(int[] arr, int t, int index) {
        int n = arr.length;

        if (index > n - 1) {
            return;
        }

        if (arr[index] == t) {
            System.out.print(index + " ");
        }

        findOccur(arr, t, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 3, 3, 6, 7, 8 };

        int t = 3;

        findOccur(arr, t, 0);
    }
}