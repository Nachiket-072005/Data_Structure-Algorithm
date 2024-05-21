public class que2 {
    public static void main(String args[]) {
        int x = 4, y = 5;
        System.out.println("Before Swap : " + x + " and " + y);
        // Swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap : " + x + " and " + y);
    }
}