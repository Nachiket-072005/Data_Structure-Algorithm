package Practice_Questions;

public class Find_All_Ocurrances {
    public static void allOcurrances(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        allOcurrances(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        allOcurrances(arr, key, 0);
    }
}