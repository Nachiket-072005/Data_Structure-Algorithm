public class Find_Key {
    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    // TC & SC = O(n)
    public static void main(String[] args) {
        int arr[] = { 4, 5, 7, 9, 2, 1, 4, 3 };
        System.out.println(firstOccurance(arr, 4, 0));
    }
}