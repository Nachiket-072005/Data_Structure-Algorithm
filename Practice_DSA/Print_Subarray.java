public class Print_Subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}