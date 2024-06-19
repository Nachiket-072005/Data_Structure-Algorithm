abstract class A {
    A() {
        System.out.println("I am a Constructor of class A");
    }

    abstract void greet();
}

class B extends A {
    void greet() {
        System.out.println("Good Morning!!");
    }

    void greet2() {
        System.out.println("Namaste.....");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        B b = new B();
        b.greet();
    }
}