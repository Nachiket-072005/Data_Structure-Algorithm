import java.util.*;

public class ArrayList_Size {
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();

                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);

                System.out.println(list.size());

                // Print Array List
                for(int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + " ");
                }
                System.out.println();
        }
}