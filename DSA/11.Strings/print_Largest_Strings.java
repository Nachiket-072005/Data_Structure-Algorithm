public class print_Largest_Strings {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        // Time Complexity = O(N * X); Where X = String length & N = How many strings
        // are present in an array.
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}