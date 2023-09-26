public class Arrays_As_Function_Arguments {

    public static void update(int marks[], int nonChangable) {
        // Here, This variable is working by pass by value...
        nonChangable = 10;
        // Here, Arrays is working by pass by reference...
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}