import java.util.ArrayList;

public class third {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9, 9 };
        ArrayList<Integer> ans = new ArrayList<>();
        int top = -1;
        for (int i = 0; i < arr.length; i++) {
            if (ans.isEmpty()) {
                ans.add(arr[i]);
                top++;
            } else if (arr[i] != ans.get(top)) {
                ans.add(arr[i]);
                top++;
            }
        }
        System.out.printf("Before: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf("%d, ", arr[i]);
            }
        }
        System.out.println("]");
        System.out.println("After: " + ans);

    }
}