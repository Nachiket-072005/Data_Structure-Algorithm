public class JavaBasic063 {
    // func1 to calc sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // func2 to calc sum of 3 nums
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(4, 4));
        System.out.println(sum(5, 3, 1));
    }
}
