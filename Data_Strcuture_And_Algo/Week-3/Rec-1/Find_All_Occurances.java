public class Find_All_Occurances {
    public static void findAllOccur(int[] arr, int index, int k) {
        if (index > arr.length - 1) {
            return;
        }

        if (arr[index] == k) {
            System.out.print(index + " ");
        }
        findAllOccur(arr, index + 1, k);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 2, 3 };
        int k = 3;

        findAllOccur(arr, 0, k);
    }
}