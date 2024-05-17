package Practice_Questions;

public class que1 {
    public static int printCount(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        int res = printCount(arr, key);
        System.out.println("Count of 7's : " + res);
    }
}
