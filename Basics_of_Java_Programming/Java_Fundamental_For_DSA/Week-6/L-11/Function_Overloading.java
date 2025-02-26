public class Function_Overloading {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum(5, 6);
        System.out.println(sum(5.6, 4.4));
        System.out.println(sum(1, 2, 3));
    }
}
