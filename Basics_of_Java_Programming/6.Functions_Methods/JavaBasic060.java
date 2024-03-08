public class JavaBasic060 {

    public static int prod(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static void main(String args[]) {
        int a = 3, b = 5;
        int product = prod(a, b);
        System.out.println("Product of a & b : " + product);
    }
}
