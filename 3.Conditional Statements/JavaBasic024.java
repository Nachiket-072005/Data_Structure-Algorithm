public class JavaBasic024 {
    public static void main(String args[]) {
        int a = 1, b = 3, c = 6;

        if(a >= b && a >= c) {
            System.out.println("a is max");
        } 
        else if(b >= c) {
            System.out.println("b is max");
        }
        else {
            System.out.println("c is max");
        }
    }
}
