public class Function_3 {
    public static void f1() {
        f3();
        System.out.println("Inside f1 function.");
    }

    public static void f2() {
        f1();
        System.out.println("Inside f2 function.");
    }

    public static void f3() {
        System.out.println("Inside f3 function.");
    }

    public static void main(String[] args) {
        f2();
        System.out.println("Inside Main Function.");
    }
}
