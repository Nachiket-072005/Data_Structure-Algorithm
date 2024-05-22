public class Find_Key_Last_Occurence {
    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 7, 9, 2, 1, 4, 3 };
        System.out.println(lastOccurance(arr, 4, 0));
    }
}