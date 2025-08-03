import java.util.*;

public class ArrayList_Basic {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();

        row.add(1);
        row.add(2);
        row.add(3);

        arr.add(new ArrayList<>(row));

        row.remove(2);

        arr.add(new ArrayList<>(row));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}