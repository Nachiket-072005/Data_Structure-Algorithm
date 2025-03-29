import java.util.Scanner;

public class Hackerank_STL_LowerBound {
    public static int findIdx(int[] arr, int[] que, int no) {
        int n = arr.length;
        int ans = arr[n - 1];

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= no) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int q = in.nextInt();
        int que[] = new int[q];
        for (int i = 0; i < q; i++) {
            que[i] = in.nextInt();
        }

        for (int j = 0; j < q; j++) {
            for (int i = 0; i < n; i++) {
                if (que[j] == arr[i]) {
                    System.out.println("Query Of " + que[j] + " -> " + "Yes " + (int) (i + 1));
                }
            }
        }

        in.close();
    }
}
