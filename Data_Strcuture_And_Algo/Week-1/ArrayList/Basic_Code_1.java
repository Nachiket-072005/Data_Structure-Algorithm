import java.util.ArrayList;

public class Basic_Code_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // List<Interger> arr = new ArrayList<>(); -> Above statement written like this
        // also.

        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr.size());
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.remove(arr.size() - 1);

        System.out.println(arr.get(arr.size() - 1));
    }
}