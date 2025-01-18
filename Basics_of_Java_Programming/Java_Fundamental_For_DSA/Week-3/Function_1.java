public class Function_1 {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        double x = 95.05;
        double y = 5.005;
        double z = 1.0000;

        System.out.println(sum(a, b));
        System.out.println(sum(x, y));
        System.out.println(sum(x, y, z));
    }
}
