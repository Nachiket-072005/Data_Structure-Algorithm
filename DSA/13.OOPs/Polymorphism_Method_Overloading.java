public class Polymorphism_Method_Overloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum(1.5f, 2.5f));
        System.out.println(c1.sum(1, 2, 3));
    }
}
//Compile Time Polymorphims
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}