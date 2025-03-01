import java.util.ArrayList;

public class Basic_Code_2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(3); // [1,2,3]

        arr.add(new ArrayList<>(row)); // [[1,2,3]]

        row.remove(2); // [1,2]

        arr.add(new ArrayList<>(row)); // [[1,2,3], [1,2]]

        // print arr

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
