public class JavaBasic059 {

    public static void swap(int a, int b) {
        // swapping code
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println("After using swap function ");
        swap(a, b);
        System.out.println("Before using swap function ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}